package com.purbon.kafka.policy;

import java.io.IOException;

public class EngineRuleFactory implements RuleFactory {

    private static EngineRuleFactory instance;

    private EngineRuleFactory() {

    }

    public static synchronized EngineRuleFactory getInstance() {
        if (instance == null) {
            instance = new EngineRuleFactory();
        }
        return instance;
    }

    @Override
    public TerminalRuleFactory create(String type) throws IOException {
        if (type.equals("topic")) {
            return TopicRuleFactory.getInstance();
        } else {
            throw new IOException("Invalid generic rule factory type: "+type);
        }
    }
}
