package com.diman3f.weather;

import com.diman3f.weather.controller.Company;
import com.diman3f.weather.model.Developer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = Company.class)
public class Config {
    @Bean
    public Developer getDeveloper() {
        return new Developer();
    }
}
