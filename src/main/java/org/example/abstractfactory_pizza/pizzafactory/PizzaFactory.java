package org.example.abstractfactory_pizza.pizzafactory;

import org.example.abstractfactory_pizza.pizza.Pizza;

public interface PizzaFactory {
    Pizza createPizza(String type);
}
