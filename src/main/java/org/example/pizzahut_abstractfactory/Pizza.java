package org.example.pizzahut_abstractfactory;

public abstract class Pizza {
    public abstract void addIngredients();
    public void bakePizza(){
        System.out.println("Bake Pizza");
    }
    public void deliverPizza(){
        System.out.println("Delivered");
    }

}
