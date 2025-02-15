package com.example.spring;

import org.springframework.stereotype.Component;

@Component
public class GreetingService {
    public void greet() {
        System.out.println("Greetings from GreetingService!");
    }
}
