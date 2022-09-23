package com.purbon.kafka.policy.rules;


import com.purbon.kafka.policy.rules.types.ComparableRule;

import java.io.IOException;

public interface TerminalRuleFactory<T> {

    ComparableRule create(String type) throws IOException;
}
