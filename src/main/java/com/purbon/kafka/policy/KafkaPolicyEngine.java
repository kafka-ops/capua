package com.purbon.kafka.policy;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.purbon.kafka.policy.parser.ParserThrowErrorListener;
import com.purbon.kafka.policy.parser.PolicyParserListener;
import com.purbon.kafka.policy.rules.ComparableRule;
import com.purbon.kafka.policy.model.Input;
import com.purbon.kafka.policy.model.Topic;
import com.purbon.kafka.policy.rules.StringFunctionRule;
import com.purbon.kafka.policy.rules.TopicRule;
import lombok.Getter;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class KafkaPolicyEngine {

    Logger logger = LoggerFactory.getLogger(KafkaPolicyEngine.class);


    public static List<String> parse(String content) {
        if (instance == null) {
            instance = new KafkaPolicyEngine();
        }
        instance.init(content);
        return instance.getErrors();
    }

    public static VerifyResult validate(String content) throws JsonProcessingException {
        Input input = (Input) JSON.toObject(content, Input.class);
        return instance.verify(input);
    }

    private static KafkaPolicyEngine instance;

    @Getter
    private List<String> errors;

    private KafkaPolicyEngine() {
        errors = new ArrayList<>();
        blocks = new Stack<>();
    }

    @Getter
    private Stack<Block> blocks;



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

    public VerifyResult verify(Input input) {
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
