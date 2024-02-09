package org.example.pattern4FACTORY;

import org.example.pattern4FACTORY.typesOfPizzas.NYStyleCheesePizza;
import org.example.pattern4FACTORY.typesOfPizzas.NYStyleClamPizza;
import org.example.pattern4FACTORY.typesOfPizzas.NYStylePepperoniPizza;
import org.example.pattern4FACTORY.typesOfPizzas.NYStyleVeggiePizza;

public class NYPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String item) {
        return switch (item) {
            case "cheese" -> new NYStyleCheesePizza();
            case "veggie" -> new NYStyleVeggiePizza();
            case "clam" -> new NYStyleClamPizza();
            case "pepperoni" -> new NYStylePepperoniPizza();
            default -> null;
        };
    }
}