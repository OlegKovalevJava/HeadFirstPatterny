package org.example.pattern4FACTORY.typesOfPizzas;

import org.example.pattern4FACTORY.Pizza;

import java.util.ArrayList;
import java.util.List;

public class NYStyleCheesePizza extends Pizza {
    String name;
    String dough;
    String sauce;
    List<String> toppings = new ArrayList<>();

    public NYStyleCheesePizza() {
        name = "NY Style Sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
    }


    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings: ");
        for (String topping : toppings) {
            System.out.println(" " + topping);
        }
    }

    @Override
    public String getName() {
        return name;
    }
}
