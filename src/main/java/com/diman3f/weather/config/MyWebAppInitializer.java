package com.diman3f.weather.config;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRegistration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.context.support.GenericWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class MyWebAppInitializer implements WebApplicationInitializer {

    @Override
    public void onStartup(final ServletContext container) throws ServletException {

//        XmlWebApplicationContext appContext = new XmlWebApplicationContext();
//        appContext.setConfigLocation("/WEB-INF/mvc-dispatcher-servlet.xml");
        //регестрируем web mvc контекст приложения
        AnnotationConfigWebApplicationContext root = new AnnotationConfigWebApplicationContext();
//указываем конфиг класс в качестве исходников для сборки ioc контейнера
        root.register(WebConfig.class);
//записываем настроенный контейнер ioc в объект с которым уже будет работать веб сервер Томкат
        container.addListener(new ContextLoaderListener(root));
//регестрируем сервлет диспатчер от Spring для того "точки входа в веб приложение"
        ServletRegistration.Dynamic dispatcher = container.addServlet("dispatcher", new DispatcherServlet(new GenericWebApplicationContext()));
        dispatcher.setLoadOnStartup(1);
        dispatcher.addMapping("/");
    }
}
