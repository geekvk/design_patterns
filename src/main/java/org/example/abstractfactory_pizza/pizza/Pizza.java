package org.example.abstractfactory_pizza.pizza;

public abstract class Pizza {
    public abstract void preparePizza();
    public void bakePizza(){
        System.out.println("Bake pizza");
    }
    public void deliverPizza(){
        System.out.println("deliver pizza");
    }
}
