package edu.cs544.sujan.spring.scopes.services;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;

public class EmailServicePractice implements ApplicationContextAware {
    private Logger logger;
    private ApplicationContext applicationContext;

    public EmailServicePractice(Logger logger) {
        System.out.println("Email service constructor");
        this.logger = logger;
    }

    public void log() {
        logger.log("Practice Logging");
    }

z

    //    public Logger getLogger() {
//        return new DBLogger();
////        return applicationContext.getBean(Logger.class);
//    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
