package com.purbon.kafka.policy;

import lombok.Getter;
import lombok.ToString;

import java.util.HashMap;
import java.util.Map;

@ToString
public class VerifyResult {

    @Getter
    Map<String, Map<String, Boolean>> summary;

    public VerifyResult() {
       this.summary = new HashMap<>();
    }

    public void addEntity(String entity) {
        if (!summary.containsKey(entity)) {
            summary.put(entity, new HashMap<>());
        }
    }

    public void addType(String entity, String type, Boolean result) {
       addEntity(entity);
       summary.get(entity).put(type, result);
    }
}
