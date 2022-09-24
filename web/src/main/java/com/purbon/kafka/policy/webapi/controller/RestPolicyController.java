package com.purbon.kafka.policy.webapi.controller;

import com.purbon.kafka.policy.VerifyResult;
import com.purbon.kafka.policy.webapi.service.KafkaPolicyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/policy")
public class RestPolicyController {

    @Autowired
    KafkaPolicyService service;

    @PostMapping(value = "/validate", consumes = "application/json")
    public VerifyResult validate(@RequestBody String content) {
        VerifyResult vr = service.validate(content);
        return vr;
    }
}
