package com.purbon.kafka.policy;

import com.purbon.kafka.policy.parser.ParserThrowErrorListener;
import com.purbon.kafka.policy.parser.PolicyParserListener;
import com.purbon.kafka.policy.rules.types.ComparableRule;
import com.purbon.kafka.policy.model.Input;
import com.purbon.kafka.policy.model.Topic;
import com.purbon.kafka.policy.rules.types.StringFunctionRule;
import com.purbon.kafka.policy.rules.types.TopicRule;
import lombok.Getter;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Main Policy Engine class used in parsing and validating an income object.
 */
public class KafkaPolicyEngine {

    Logger logger = LoggerFactory.getLogger(KafkaPolicyEngine.class);

    @Getter
    private List<String> errors;
    @Getter
    private Stack<Block> blocks;

    private KafkaPolicyEngine() {
        errors = new ArrayList<>();
        blocks = new Stack<>();
    }

    /**
     * Given a policy content based on the REGO language, it creates an engine instance
     * that can be used for later validation.
     * @param content A Rego valid string for the policy engine
     * @return List<String> list of found errors, if any.
     */
    public List<String> parse(String content) {
        init(content);
        return getErrors();
    }

    private static KafkaPolicyEngine instance;

    /**
     * Singleton method
     * @return KafkaPolicyEngine
     */
    public synchronized static KafkaPolicyEngine getInstance() {
        if (instance == null) {
            instance = new KafkaPolicyEngine();
        }
        return instance;
    }



    public void init(String content) {
        RegoLexer lexer = new RegoLexer(CharStreams.fromString(content));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        RegoParser parser = new RegoParser(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener(ParserThrowErrorListener.INSTANCE);

        ParseTreeWalker walker = new ParseTreeWalker();
        PolicyParserListener listener = new PolicyParserListener();

        walker.walk(listener, parser.root());

        blocks = listener.getBlocks();

        for(Block block : blocks) {
            logger.trace(block.toString());
        }
    }

    public VerifyResult validate(String content) {
        InputContentParser icp = new InputContentParser();
        return validate(icp.parse(content));
    }

    public VerifyResult validate(Input input) {
        VerifyResult vr = new VerifyResult();
        for(Topic topic : input.getTopics()) {
            vr.addEntity(topic.toString());
            for(Block block : blocks) {
                boolean result = true;
                for(ComparableRule rule : block.getRules()) {
                    if (rule instanceof TopicRule) {
                        TopicRule tr = (TopicRule) rule;
                        var isValid = tr.isValid(topic);
                        result &= isValid;
                    } else if (rule instanceof StringFunctionRule) {
                        StringFunctionRule fa = (StringFunctionRule) rule;
                        var isValid = fa.isValid(topic.getName());
                        result &= isValid;
                    }
                }
                vr.addType(topic.toString(), block.getType(), result);
            }
        }
        return vr;
    }
}
