package com.attentivemobile.interview.library;

import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.Bean;

@AutoConfiguration
public class LibraryAutoConfiguration {
    @Bean
    public GreetingService greetingService() {
        return new GreetingService();
    }
}
