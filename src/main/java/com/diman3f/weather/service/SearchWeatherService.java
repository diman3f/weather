package com.diman3f.weather.service;

import com.diman3f.weather.api.WeatherApiClient;
import com.diman3f.weather.dto.WeatherData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service // TODO: 23.03.2026 называется stereotype расширяет @Component и несет доп функциональность которая характерна для слоя сервиса например детали работы с транзакцией
public class SearchWeatherService { // TODO: 23.03.2026 добавил сервис для поиска погоды

    private final WeatherApiClient weatherApiClient;

    public SearchWeatherService(WeatherApiClient weatherApiClient) {
        this.weatherApiClient = weatherApiClient;
    }

    public WeatherData searchWeatherByLocation(WeatherData data) { // TODO: 23.03.2026 принмаю dto чтобы обновить и вернуть новую dto
        WeatherData dto = weatherApiClient.getWeatherByLocation("Samara");
        return dto;
    }

}
