package org.example.pattern4FACTORY.typesOfPizzas;

import org.example.pattern4FACTORY.Pizza;

import java.util.ArrayList;
import java.util.List;

public class ChicagoStyleCheesePizza extends Pizza {
    String name;
    String dough;
    String sauce;
    List<String> toppings = new ArrayList<>();

    public ChicagoStyleCheesePizza() {
        name = "Chicago Style Deep Dish Cheese Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
    }

    @Override
    public void prepare() {
        super.prepare();
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }

    @Override
    public String getName() {
        return name;
    }
}