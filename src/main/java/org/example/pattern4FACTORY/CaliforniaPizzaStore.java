package org.example.pattern4FACTORY;

import org.example.pattern4FACTORY.typesOfPizzas.*;

public class CaliforniaPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String item) {
        return switch (item) {
            case "cheese" -> new CaliforniaStyleCheesePizza();
            case "pepperoni" -> new CaliforniaStylePepperoniPizza();
            case "clam" -> new CaliforniaStyleClamPizza();
            case "veggie" -> new CaliforniaStyleVeggiePizza();
            default -> null;
        };
    }
}