package com.purbon.kafka.policy;


import java.io.IOException;

public interface RuleFactory {

    TerminalRuleFactory create(String type) throws IOException;
}
