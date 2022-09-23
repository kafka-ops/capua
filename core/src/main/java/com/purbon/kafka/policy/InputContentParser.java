package com.purbon.kafka.policy;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.purbon.kafka.policy.model.Input;
import com.purbon.kafka.policy.utils.JSON;

public class InputContentParser {

    public Input parse(String content) {
        Input input = null;
        try {
            input = (Input) JSON.toObject(content, Input.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException("There are problems interpreting the incoming JSON format");
        }
        return input;
    }
}
