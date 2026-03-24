package com.diman3f.weather.model;

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

    @Override
    public String toString() {
        return "Company{" +
                "developer=" + developer +
                '}';
    }
}
