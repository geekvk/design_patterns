package org.example.abstractfactory_pizza.pizza;

import org.example.abstractfactory_pizza.topping.ITopping;
import org.example.pizzahut_abstractfactory.Topping;

public class PepperoniPizza extends Pizza{
    private ITopping topping;

    public PepperoniPizza(ITopping topping) {
        this.topping = topping;
    }

    @Override
    public void preparePizza() {
        System.out.println("Peproni Pizza is getting ready...");
        topping.createSource();
        topping.createChese();
    }
}
