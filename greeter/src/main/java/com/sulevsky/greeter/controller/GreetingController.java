package com.sulevsky.greeter.controller;

import com.sulevsky.greeter.model.Greet;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private final String defaultGreeting;

    public GreetingController(@Value("${default-greeting}") String defaultGreeting) {
        this.defaultGreeting = defaultGreeting;
    }

    @GetMapping("/greet")
    public Greet readGreet() {
        return new Greet("Vova", defaultGreeting);
    }
}
