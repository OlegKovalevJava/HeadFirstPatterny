package org.example;

public class Duck implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("Полет");
    }
}
