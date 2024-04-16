package com.example.demo;

public interface Observer {
    //Source: https://www.digitalocean.com/community/tutorials/observer-design-pattern-in-java
    //Methods to register and unregister observer
    public void register(Observer obj);
    public void unregister(Observer obj);
    //Method to notify observers of change.
    public void notifyObserver();
    //Method to get update from observed subject (i.e. observed object).
    public void update(int points);
}
