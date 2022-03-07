package edu.cs544.sujan.spring.scopes.services;

public class FileLogger implements Logger {
    @Override
    public void log(String log) {
        System.out.println("logging " + log + " to file...");
    }
}
