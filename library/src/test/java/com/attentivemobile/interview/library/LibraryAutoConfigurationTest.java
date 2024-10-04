package com.attentivemobile.interview.library;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.AutoConfigurations;
import org.springframework.boot.test.context.runner.ApplicationContextRunner;

class LibraryAutoConfigurationTest {
    private final ApplicationContextRunner runner = new ApplicationContextRunner()
        .withConfiguration(AutoConfigurations.of(LibraryAutoConfiguration.class));

    @Test
    void hasGreetingServiceBean() {
        runner.run(context -> assertThat(context).hasSingleBean(GreetingService.class));
    }
}