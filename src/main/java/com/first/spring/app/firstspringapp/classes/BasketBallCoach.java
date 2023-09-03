package com.first.spring.app.firstspringapp.classes;

import com.first.spring.app.firstspringapp.interfaces.Coach;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
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

    @PostConstruct
    public void postContstructTrigger() {
        System.out.println("This is triggered only after the constructor is initialized");
    }

    @PreDestroy
    public void preDestroyOnClosingConstructor() {
        System.out.println("Tadaaaa");
    }
}
