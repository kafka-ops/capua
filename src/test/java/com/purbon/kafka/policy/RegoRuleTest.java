package com.purbon.kafka.policy;

import static org.junit.jupiter.api.Assertions.*;

import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RegoRuleTest {

    @BeforeEach
    public void setup() {

    }

    @Test
    public void shouldParseRulesSuccessfully() {
       String regoRule = "package authz \n allow { input.port == \"9201\" \n topic.partition == 3 \n foo(1,2,3) }";
       assertDoesNotThrow(() ->  KafkaPolicyEngine.parse(regoRule));
    }

    @Test
    public void shouldRaiseAnExceptionForInvalid() {
        String regoRule = "package authz \n allow { input.port == \"9201\" \n topic.partition == 3 \n foo(1,2 }";
        assertThrows(ParseCancellationException.class, () -> KafkaPolicyEngine.parse(regoRule));
    }
}
