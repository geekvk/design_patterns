package org.example.abstractfactory_pizza.pizza;

import org.example.abstractfactory_pizza.topping.ITopping;
import org.example.pizzahut_abstractfactory.Topping;

public class VegiPizza extends Pizza{
    private ITopping topping;

    public VegiPizza(ITopping topping) {
        this.topping = topping;
    }

    @Override
    public void preparePizza() {
        System.out.println("Veg Pizza is getting ready....");
        topping.createChese();
        topping.createSource();
    }
}
