package com.diman3f.weather.dao;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ViewResolver;

import javax.management.ConstructorParameters;
import java.beans.ConstructorProperties;

public class TestComponent {
    private int year;
    private int month;
    private ViewResolver resolver;


    public TestComponent(@Value("${app.port:8080}") int year, @Value("${app.port:8080}")int month, ViewResolver resolver) {
        this.year = year;
        this.month = month;
        this.resolver = resolver;
    }

    @Override
    public String toString() {
        return "TestComponent{" +
                "year=" + year +
                ", month=" + month +
                ", resolver=" + resolver +
                '}';
    }
}
