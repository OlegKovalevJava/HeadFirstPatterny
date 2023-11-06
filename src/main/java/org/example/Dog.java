package org.example;

public class Dog extends Animal{
    @Override
    void makeSound() {
        bark();
    }

    void bark() {
        System.out.println("GAV GAV");
    }
}
