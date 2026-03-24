package com.diman3f.weather.controller;

import com.diman3f.weather.dao.BaseDao;
import com.diman3f.weather.dao.TestComponent;
import com.diman3f.weather.dao.WeatherDaoImpl;
import com.diman3f.weather.model.Developer;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.logging.Logger;

@Controller
public class DeveloperController {
    private Logger logger = Logger.getLogger(String.valueOf(DeveloperController.class));


    private final BaseDao<String> weatherDao;
    private final TestComponent component;

    protected DeveloperController(BaseDao<String> weatherDao, TestComponent component) {
        this.weatherDao = weatherDao;
        this.component = component;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "/index";
    }

    //ручка на добавление деволопера
    @RequestMapping(value = "/developer", method = RequestMethod.GET)
    public ModelAndView developer() {

        return new ModelAndView("developer", "command", new Developer());
    }

    @RequestMapping(value = "/addDeveloper", method = RequestMethod.POST)
    public String addStudent(@ModelAttribute("mvc-dispatcher") Developer developer, ModelMap model) {
        model.addAttribute("id", developer.getId());
        model.addAttribute("name", developer.getName());
        model.addAttribute("specialty", developer.getSpecialty());
        model.addAttribute("experience", developer.getExperience());
        String samara = weatherDao.findByLocation("Samara");
        model.addAttribute("location", samara + component.toString());
        logger.info("This is an info log entry");

        return "result";
    }
}
