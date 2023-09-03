package com.first.spring.app.firstspringapp.config;

import com.first.spring.app.firstspringapp.classes.SwimmingCoach;
import com.first.spring.app.firstspringapp.interfaces.Coach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportsConfig {
    @Bean("swimmingCoach")
    public Coach swimCoach() {
        return new SwimmingCoach();
    }
}
