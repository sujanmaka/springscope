package edu.cs544.sujan.spring.scopes.config;

import edu.cs544.sujan.spring.scopes.services.EmailService;
import edu.cs544.sujan.spring.scopes.services.FileLogger;
import edu.cs544.sujan.spring.scopes.services.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration
public class SpringConfig {

    @Bean
    @Scope(value = "singleton")
    @Lazy(value = false)
    public EmailService emailService() {
//        return new EmailService(logger()) {
//            @Override
//            public Logger getLogger() {
//                return logger();
//            }
//        };
        return null;
    }

    @Bean
    @Scope("prototype")
    public Logger logger() {
        return new FileLogger();
    }
}
