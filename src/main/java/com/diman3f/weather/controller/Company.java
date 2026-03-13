package com.diman3f.weather.controller;

import com.diman3f.weather.model.Developer;
import org.springframework.stereotype.Component;

@Component
public class Company {
    private Developer developer;

    public Company(Developer developer) {
        this.developer = developer;
    }

    public Developer getDeveloper() {
        return developer;
    }

    public void setDeveloper(Developer developer) {
        this.developer = developer;
    }
}
