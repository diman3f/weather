package com.diman3f.weather.dto;

import java.beans.ConstructorProperties;

public class WeatherData { // TODO: 22.03.2026 добавил dto weatherDate
    private String data;
    private String location;

    @ConstructorProperties({"data", "location"})
    public WeatherData(String data, String location) {
        this.data = data;
        this.location = location;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
