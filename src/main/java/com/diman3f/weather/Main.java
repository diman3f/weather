//package com.diman3f.weather;
//
//import com.diman3f.weather.config.AppConfig;
//import com.diman3f.weather.model.Company;
//import com.diman3f.weather.model.Developer;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//
//public class Main {
//    public static void main(String[] args) {
//        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//        Developer developer = context.getBean("developer", Developer.class);
//        Company company = context.getBean("company", Company.class);
//        System.out.println(developer);
//        System.out.println(company);
//    };
//}
