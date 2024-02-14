package org.example.pattern4FACTORY.typesOfPizzas;

import org.example.pattern4FACTORY.factory.PizzaIngredientFactory;

public class VeggiePizza extends Pizza {
    public VeggiePizza(PizzaIngredientFactory ingredientFactory) {
        super();
    }

    @Override
    public void prepare() {

    }
}