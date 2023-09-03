package com.first.spring.app.firstspringapp.classes;

import com.first.spring.app.firstspringapp.interfaces.Coach;
import org.springframework.stereotype.Component;


public class SwimmingCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Swim 100 meters every day";
    }
}
