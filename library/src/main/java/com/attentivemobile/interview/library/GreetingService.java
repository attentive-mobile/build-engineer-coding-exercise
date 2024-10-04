package com.attentivemobile.interview.library;

public class GreetingService {
    public String getGreeting(String name) {
        if (name == null || name.isBlank()) {
            return "Hello World!";
        }
        return "Hello %s!".formatted(name);
    }
}
