package org.example.pattern1STRATEGY;

//ПИСК
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
