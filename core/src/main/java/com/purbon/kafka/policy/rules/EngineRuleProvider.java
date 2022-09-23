package com.purbon.kafka.policy.rules;

import java.io.IOException;

public class EngineRuleProvider implements RuleProvider {

    private static EngineRuleProvider instance;

    private EngineRuleProvider() {

    }

    public static synchronized EngineRuleProvider getInstance() {
        if (instance == null) {
            instance = new EngineRuleProvider();
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
