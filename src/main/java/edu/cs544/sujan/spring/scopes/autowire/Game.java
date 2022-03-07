package edu.cs544.sujan.spring.scopes.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Game {
//    @Autowired(required = false)
    private Car car;
//    @Autowired(required = true)
//    @Qualifier("bike1")
    private Bike bike;

    public void setCar(Car car) {
        this.car = car;
    }

    public void setBike(Bike bike) {
        this.bike = bike;
    }

    public Game() {
    }

        @Autowired
    public Game(Car car, /*@Qualifier("bike1")*/ Bike bike) {
        this.car = car;
        this.bike = bike;
    }

    public void play() {
        System.out.println("Game started");
        if (car != null) {
            car.move();
        }
        if (bike != null) {
            bike.move();
        }
        System.out.println("Game ended");
    }
}
