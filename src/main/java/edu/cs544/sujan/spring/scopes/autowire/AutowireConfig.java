package edu.cs544.sujan.spring.scopes.autowire;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AutowireConfig {
    @Bean
    public Car car() {
        return new Car();
    }

    @Bean
    public Bike bike() {
        return new Bike();
    }

    @Bean
    public Game game() {
        return new Game(car(), bike());
    }
}
