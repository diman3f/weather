//package com.diman3f.weather.config;
//
//import com.diman3f.weather.model.Company;
//import com.diman3f.weather.model.Developer;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//@ComponentScan(basePackages = "com.diman3f.weather.config")
//
//public class AppConfig {
//    @Bean(name = "developer")
//    public Developer developer() {
//        return new Developer();
//    }
//    @Bean(name="company")
//    public Company company() {
//        return new Company(developer());
//    }
//}
