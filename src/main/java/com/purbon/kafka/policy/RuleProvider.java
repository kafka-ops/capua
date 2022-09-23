package com.purbon.kafka.policy;


import java.io.IOException;

public interface RuleProvider {

    TerminalRuleFactory create(String type) throws IOException;
}
