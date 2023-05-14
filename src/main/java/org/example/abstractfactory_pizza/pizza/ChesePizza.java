package org.example.abstractfactory_pizza.pizza;

import org.example.abstractfactory_pizza.topping.ITopping;
import org.example.pizzahut_abstractfactory.Topping;

public class ChesePizza extends Pizza{
    private ITopping topping;

    public ChesePizza(ITopping topping) {
        this.topping = topping;
    }

    @Override
    public void preparePizza() {
        System.out.println("Chese pizza is getting ready");
        topping.createChese();
        topping.createSource();
    }
}
