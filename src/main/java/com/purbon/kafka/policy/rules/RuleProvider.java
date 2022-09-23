package com.purbon.kafka.policy.rules;


import com.purbon.kafka.policy.rules.TerminalRuleFactory;

import java.io.IOException;

public interface RuleProvider {

    TerminalRuleFactory create(String type) throws IOException;
}
