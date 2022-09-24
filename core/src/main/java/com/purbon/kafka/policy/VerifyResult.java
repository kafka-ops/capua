package com.purbon.kafka.policy;

import lombok.Getter;
import lombok.ToString;

import java.util.HashMap;
import java.util.Map;

@ToString
public class VerifyResult {

    @Getter
    Map<String, Map<String, Boolean>> topics;

    public VerifyResult() {
       this.topics = new HashMap<>();
    }

    public void addEntity(String entity) {
        if (!topics.containsKey(entity)) {
            topics.put(entity, new HashMap<>());
        }
    }

    public void addType(String entity, String type, Boolean result) {
       addEntity(entity);
       topics.get(entity).put(type, result);
    }
}
