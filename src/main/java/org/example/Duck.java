package org.example;

public abstract class Duck {
    QuackBehavior quackBehavior;

    public void performQuack() {
        quackBehavior.quack();
    }

}
