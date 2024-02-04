package org.example.pattern4FACTORY;

public class VeggiePizza extends Pizza {
    @Override
    void prepare() {

    }

    @Override
    void bake() {
        System.out.println("Выпекание");
    }

    @Override
    void cut() {

    }

    @Override
    void box() {

    }
}
