package org.example.pizzahut_abstractfactory;

public class ChesePizza extends Pizza{
    private Topping topping;

    public ChesePizza(Topping topping) {
        this.topping = topping;
    }

    @Override
    public void addIngredients() {
        System.out.println("Chese pizza ingredients");
        topping.createChese();
        topping.createSource();
    }
}
