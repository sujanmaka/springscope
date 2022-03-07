package edu.cs544.sujan.spring.scopes.services;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;


/*
* implement ApplicationContextAware for having prototype scope of injecting bean
* for eg: emailService is the parent bean (singleton scope), and we have logger bean (prototype scope)
* */
public /*abstract*/ class EmailService /*implements ApplicationContextAware*/{
    @Autowired
    @Qualifier(value = "fileLogger")
    private Logger logger;
    private ApplicationContext applicationContext;

    public EmailService() {
    }

    //    public EmailService(Logger logger) {
//        System.out.println("Email service constructor");
//        this.logger = logger;
//    }

//    public Logger getLogger() {
//        return applicationContext.getBean(Logger.class);
//    }
//    public abstract Logger getLogger();

//    public void setLogger(Logger logger) {
//        this.logger = logger;
//    }

    public void sendEmail() {
        System.out.println("Sending email.....");
        logger.log("email send");
    }

    @Override
    public String toString() {
        return "EmailService{" +
                "logger=" + logger +
                '}';
    }


//    @Override
//    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
//        this.applicationContext = applicationContext;
//    }
}
