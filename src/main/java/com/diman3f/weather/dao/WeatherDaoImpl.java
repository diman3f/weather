package com.diman3f.weather.dao;

import org.springframework.stereotype.Repository;

@Repository
public class WeatherDaoImpl implements BaseDao<String> {

    public String findByLocation(String location) {
        return location;
    }
}
