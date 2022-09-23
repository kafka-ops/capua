package com.purbon.kafka.policy;

import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class KafkaPolicyEngineTest {

    private KafkaPolicyEngine engine;

    @BeforeEach
    public void setup() {
        engine = KafkaPolicyEngine.getInstance();
    }

    @Test
    public void shouldParseRulesSuccessfully() {
       String regoRule = "package authz \n allow { topic.partitions == 3 \n foo(1,2,3) }";
       assertDoesNotThrow(() ->  engine.parse(regoRule));
    }

    @Test
    public void shouldRaiseAnExceptionForInvalid() {
        String regoRule = "package authz \n allow { input.port == \"9201\" \n topic.partitions == 3 \n foo(1,2 }";
        assertThrows(ParseCancellationException.class, () -> engine.parse(regoRule));
    }
}
