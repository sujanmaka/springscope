package edu.cs544.sujan.spring.scopes.config;

import edu.cs544.sujan.spring.scopes.services.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class SpringConfigPractice {
    @Bean
    @Scope(value = "prototype")
    public EmailServicePractice emailServicePractice() {
        return new EmailServicePractice(logger()) {
            @Override
            public Logger getLogger() {
                return null;
            }
        };
    }

    @Bean
    public Logger logger() {
        return new FileLogger();
    }


    @Bean
    public PrototypeDestroy prototypeDestroy() {
        return new PrototypeDestroy();
    }
}
