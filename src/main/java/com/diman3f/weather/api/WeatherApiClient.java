package com.diman3f.weather.api;

import com.diman3f.weather.dto.WeatherData;

public interface WeatherApiClient { // TODO: 22.03.2026 добавил интерфейс для получения данных о погоде
    
    WeatherData getWeatherByLocation(String location); // TODO: 22.03.2026

}
