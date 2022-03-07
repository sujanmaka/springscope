package edu.cs544.sujan.spring.scopes.services;

public class DBLogger implements Logger {
    @Override
    public void log(String log) {
        System.out.println("Logging " + log + " to DB...");
    }
}
