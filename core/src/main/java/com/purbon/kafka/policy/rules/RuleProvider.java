package com.purbon.kafka.policy.rules;


import java.io.IOException;

public interface RuleProvider {

    TerminalRuleFactory create(String type) throws IOException;
}
