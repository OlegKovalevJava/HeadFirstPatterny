package org.example.pattern4FACTORY.typesOfPizzas;

import org.example.pattern4FACTORY.Pizza;
import org.example.pattern4FACTORY.PizzaIngredientFactory;

public class CheesePizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public CheesePizza() {
    }

    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }


    @Override
    public void prepare() {

    }
}
