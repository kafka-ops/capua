package com.purbon.kafka.policy.rules;

import com.purbon.kafka.policy.model.Topic;

public interface TopicRule {

    boolean isValid(Topic topic);
}
