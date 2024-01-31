package org.example.pattern3DECORATOR;

public class Main {
    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        String description = espresso.getDescription();
        System.out.println(description);

    }
}