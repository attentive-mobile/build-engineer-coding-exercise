package com.attentivemobile.interview.library;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class GreetingServiceTest {
    private final GreetingService greetingService = new GreetingService();

    @Test
    void handlesNullName() {
        assertThat(greetingService.getGreeting(null)).isEqualTo("Hello World!");
    }

    @Test
    void returnsNameWithString() {
        assertThat(greetingService.getGreeting("Banana")).isEqualTo("Hello Banana!");
    }
}