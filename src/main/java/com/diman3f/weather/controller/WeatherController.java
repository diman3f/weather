package com.diman3f.weather.controller;

// TODO: 23.03.2026 добавлен контроллер поиск погоды, сохранение погоды

import com.diman3f.weather.dto.WeatherData;
import com.diman3f.weather.service.SearchWeatherService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WeatherController {

    private SearchWeatherService service;

    public WeatherController(SearchWeatherService service) {
        this.service = service;
    }


    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public String search(WeatherData data, ModelMap modelMap) {
        WeatherData weatherData = service.searchWeatherByLocation(data);
        modelMap.addAttribute("temp", weatherData.getData());
        modelMap.addAttribute("location", weatherData.getLocation());
        return "result";
    }

}
