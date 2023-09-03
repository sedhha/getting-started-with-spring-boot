package com.first.spring.app.firstspringapp.classes;

import com.first.spring.app.firstspringapp.interfaces.Coach;
import org.springframework.stereotype.Component;

@Component
public class BasketBallCoach implements Coach {

    public BasketBallCoach() {
        System.out.println("Basket-Ball Coach initialized");
    }
    @Override
    public String getDailyWorkout() {
        return "Hey there! Let's make it to hoops";
    }
}
