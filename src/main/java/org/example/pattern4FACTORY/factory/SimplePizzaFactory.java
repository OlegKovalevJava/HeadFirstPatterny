package org.example.pattern4FACTORY.factory;

import org.example.pattern4FACTORY.typesOfPizzas.*;

public class SimplePizzaFactory {

    PizzaIngredientFactory ingredientFactory;
    public Pizza createPizza(String type) {

        return switch (type) {
            case "cheese" -> new CheesePizza();
            case "pepperoni" -> new PepperoniPizza(ingredientFactory);
            case "clam" -> new ClamPizza();
            case "veggie" -> new VeggiePizza(ingredientFactory);
            default -> null;
        };
    }
}