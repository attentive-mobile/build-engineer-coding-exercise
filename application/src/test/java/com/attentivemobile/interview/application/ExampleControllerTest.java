package com.attentivemobile.interview.application;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.attentivemobile.interview.library.LibraryAutoConfiguration;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(controllers = ExampleController.class)
@ImportAutoConfiguration(LibraryAutoConfiguration.class)
class ExampleControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void handlesMissingName() throws Exception {
        mockMvc.perform(get("/hello"))
            .andExpect(status().isOk())
            .andExpect(content().string("Hello World!"));
    }

    @Test
    void returnsGreetingWithName() throws Exception {
        mockMvc.perform(get("/hello").queryParam("name", "Candidate"))
            .andExpect(status().isOk())
            .andExpect(content().string("Hello Candidate!"));
    }
}