package org.example.pattern4FACTORY;

import org.example.pattern4FACTORY.typesOfPizzas.ChicagoStyleCheesePizza;
import org.example.pattern4FACTORY.typesOfPizzas.ChicagoStyleClamPizza;
import org.example.pattern4FACTORY.typesOfPizzas.ChicagoStylePepperoniPizza;
import org.example.pattern4FACTORY.typesOfPizzas.ChicagoStyleVeggiePizza;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String item) {
        return switch (item) {
            case "cheese" -> new ChicagoStyleCheesePizza();
            case "pepperoni" -> new ChicagoStylePepperoniPizza();
            case "clam" -> new ChicagoStyleClamPizza();
            case "veggie" -> new ChicagoStyleVeggiePizza();
            default -> null;
        };
    }
}