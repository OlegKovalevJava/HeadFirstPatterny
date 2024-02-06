package org.example.pattern4FACTORY;

import org.example.pattern4FACTORY.typesOfPizzas.CheesePizza;
import org.example.pattern4FACTORY.typesOfPizzas.ClamPizza;
import org.example.pattern4FACTORY.typesOfPizzas.PepperoniPizza;
import org.example.pattern4FACTORY.typesOfPizzas.VeggiePizza;

public class SimplePizzaFactory {
    public Pizza createPizza(String type) {

        return switch (type) {
            case "cheese" -> new CheesePizza();
            case "pepperoni" -> new PepperoniPizza();
            case "clam" -> new ClamPizza();
            case "veggie" -> new VeggiePizza();
            default -> null;
        };
    }
}