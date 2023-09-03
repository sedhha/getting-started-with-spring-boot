package com.first.spring.app.firstspringapp.controllers;

import com.first.spring.app.firstspringapp.interfaces.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DemoController {

    private final Coach myCoach;

    @Autowired
    public DemoController(@Qualifier("swimmingCoach") Coach coach) {
        myCoach = coach;
    }
    @GetMapping("daily-workout")
    String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }
}
