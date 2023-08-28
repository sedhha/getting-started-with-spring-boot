package com.first.spring.app.firstspringapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstRestController {

    @Value("${app.name}")
    private String appName;
    @GetMapping("/")
    public String sayHello() {
        return "Hello Shivam, You're now in Java as well and the name of the app is "+appName;
    }
    @GetMapping("/workout")
    public String getWorkOut() {
        return "Let's try to run a mile today";
    }
    @GetMapping("/fortune")
    public String getFortune() {
        return "Today is your lucky day";
    }
}
