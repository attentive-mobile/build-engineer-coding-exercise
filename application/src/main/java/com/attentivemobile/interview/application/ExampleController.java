package com.attentivemobile.interview.application;

import com.attentivemobile.interview.library.GreetingService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {
    private final GreetingService greetingService;

    public ExampleController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @GetMapping(value = "/hello", produces = MediaType.TEXT_PLAIN_VALUE)
    public String greeting(@RequestParam(value = "name", required = false) String name) {
        return greetingService.getGreeting(name);
    }
}
