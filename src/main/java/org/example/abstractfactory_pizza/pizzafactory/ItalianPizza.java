package org.example.abstractfactory_pizza.pizzafactory;

import org.example.abstractfactory_pizza.pizza.ChesePizza;
import org.example.abstractfactory_pizza.pizza.PepperoniPizza;
import org.example.abstractfactory_pizza.pizza.Pizza;
import org.example.abstractfactory_pizza.pizza.VegiPizza;
import org.example.abstractfactory_pizza.topping.ChillieTopping;
import org.example.abstractfactory_pizza.topping.ITopping;
import org.example.pizzahut_abstractfactory.Topping;

public class ItalianPizza implements PizzaFactory{
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza;
        ITopping topping = new ChillieTopping();
        switch (type){
            case "chese":
                pizza = new ChesePizza(topping);
                break;
            case "peperoni":
                pizza = new PepperoniPizza(topping);
                break;
            case "vegi":
                pizza = new VegiPizza(topping);
                break;
            default:
                throw new IllegalArgumentException("Pizza type not found");
        }
        pizza.preparePizza();
        pizza.bakePizza();
        pizza.deliverPizza();
        return pizza;

    }
}
