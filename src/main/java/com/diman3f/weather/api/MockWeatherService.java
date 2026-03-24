package com.diman3f.weather.api;

import com.diman3f.weather.dto.WeatherData;
import org.springframework.stereotype.Component;

// TODO: 22.03.2026 рассмотреть возможность добавления кеша чтобы не дергать api часто

@Component
public class MockWeatherService implements WeatherApiClient {
//    private зависимость на внешний сервис API в этом классе нужно реализовать запросы к нему, прямая обязаность сервиса

    public MockWeatherService() {
    }

    @Override
    public WeatherData getWeatherByLocation(String location) {
        //todo в этом месте нужно будет дессерилизовать сырые данные с внешнего Api
        //смапить созданный объект в dto
        return new WeatherData("Температура +20, Влажность 35%", location);
    }
}
