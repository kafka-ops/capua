package com.purbon.kafka.policy.rules;

import com.purbon.kafka.policy.model.Topic;

public class TopicReplicationFactorRule extends LiteralRule<Double> implements TopicRule {

    public TopicReplicationFactorRule(String literal) {
        setLiteral(literal);
    }

    @Override
    public boolean isValid(Topic topic) {
        return super.isValid((double)topic.getReplicationFactor());
    }
}
