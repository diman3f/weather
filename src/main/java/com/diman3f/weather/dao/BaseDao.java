package com.diman3f.weather.dao;

import org.springframework.stereotype.Repository;


public interface BaseDao <T> {
    T findByLocation(T location);
}
