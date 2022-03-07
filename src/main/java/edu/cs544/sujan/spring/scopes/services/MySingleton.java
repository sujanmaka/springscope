package edu.cs544.sujan.spring.scopes.services;

public class MySingleton {
    private static MySingleton instance = new MySingleton();
    private MySingleton() {

    }

    public static MySingleton getInstance() {
//        if (instance == null) {


        return instance;
    }
}
