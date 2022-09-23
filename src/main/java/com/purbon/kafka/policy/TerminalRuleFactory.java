package com.purbon.kafka.policy;


import com.purbon.kafka.policy.rules.ComparableRule;

import java.io.IOException;

public interface TerminalRuleFactory<T> {

    ComparableRule create(String type) throws IOException;
}
