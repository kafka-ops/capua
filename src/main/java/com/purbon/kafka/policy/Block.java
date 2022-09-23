package com.purbon.kafka.policy;

import com.purbon.kafka.policy.rules.ComparableRule;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Block {

    private String type;
    private List<ComparableRule> rules;

    public Block() {
        this.type = "";
        this.rules = new ArrayList<>();
    }

    public void addAction(ComparableRule rule) {
        this.rules.add(rule);
    }
}
