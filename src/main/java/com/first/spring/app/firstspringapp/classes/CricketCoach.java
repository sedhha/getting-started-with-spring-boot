package com.first.spring.app.firstspringapp.classes;

import com.first.spring.app.firstspringapp.interfaces.Coach;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class CricketCoach implements Coach {

    public CricketCoach() {
        System.out.println("Cricket-Ball Coach initialized");
    }
    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }
}
