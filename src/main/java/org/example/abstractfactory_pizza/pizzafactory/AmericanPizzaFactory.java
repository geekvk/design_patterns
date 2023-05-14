package org.example.abstractfactory_pizza.pizzafactory;

import org.example.abstractfactory_pizza.pizza.ChesePizza;
import org.example.abstractfactory_pizza.pizza.Pizza;
import org.example.abstractfactory_pizza.topping.ITopping;
import org.example.abstractfactory_pizza.topping.SilicoToppingImpl;

public class AmericanPizzaFactory implements PizzaFactory{
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza;
        ITopping silico = new SilicoToppingImpl();
        switch (type){
            case "chese":
                pizza = new ChesePizza(silico);
                break;
            default:
                throw new IllegalArgumentException("Pizza type is not found");
        }
        pizza.preparePizza();
        pizza.bakePizza();
        pizza.deliverPizza();
        return pizza;
    }
}
