package com.purbon.kafka.policy.rules;

import com.purbon.kafka.policy.model.Topic;
import com.purbon.kafka.policy.rules.types.ComparableRule;
import com.purbon.kafka.policy.rules.types.TopicPartitionRule;
import com.purbon.kafka.policy.rules.types.TopicReplicationFactorRule;

import java.io.IOException;

public class TopicRuleFactory implements TerminalRuleFactory<Topic> {

    private static TopicRuleFactory instance;

    private TopicRuleFactory() {

    }

    public static synchronized TopicRuleFactory getInstance() {
        if (instance == null) {
            instance = new TopicRuleFactory();
        }
        return instance;
    }

    public ComparableRule create(String type) throws IOException {
        if (type.equals("partitions")) {
            return new TopicPartitionRule("topic.partitions");
        } else if (type.equals("replicationFactor")) {
            return new TopicReplicationFactorRule("topic.replicationFactor");
        } else {
            throw new IOException("Invalid topic action detected: "+type);
        }
    }
}
