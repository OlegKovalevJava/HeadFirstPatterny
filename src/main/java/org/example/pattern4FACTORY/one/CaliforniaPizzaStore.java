package org.example.pattern4FACTORY.one;

import org.example.pattern4FACTORY.one.typesOfPizzas.CaliforniaStyleCheesePizza;
import org.example.pattern4FACTORY.one.typesOfPizzas.CaliforniaStyleClamPizza;
import org.example.pattern4FACTORY.one.typesOfPizzas.CaliforniaStylePepperoniPizza;
import org.example.pattern4FACTORY.one.typesOfPizzas.CaliforniaStyleVeggiePizza;

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
