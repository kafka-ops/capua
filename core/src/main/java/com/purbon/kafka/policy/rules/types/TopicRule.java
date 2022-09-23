package com.purbon.kafka.policy.rules.types;

import com.purbon.kafka.policy.model.Topic;

public interface TopicRule {

    boolean isValid(Topic topic);
}
