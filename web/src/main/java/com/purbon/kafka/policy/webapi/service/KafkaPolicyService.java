package com.purbon.kafka.policy.webapi.service;

import com.purbon.kafka.policy.KafkaPolicyEngine;
import com.purbon.kafka.policy.VerifyResult;
import com.purbon.kafka.policy.webapi.Utils;
import org.springframework.stereotype.Service;

@Service
public class KafkaPolicyService {

    private KafkaPolicyEngine engine;

    public KafkaPolicyService() {
        engine = KafkaPolicyEngine.getInstance();
        engine.init(Utils.getResourceFileAsString("kafka-policy.rego"));
    }

    public VerifyResult validate(String content) {
        return engine.validate(content);
    }
}
