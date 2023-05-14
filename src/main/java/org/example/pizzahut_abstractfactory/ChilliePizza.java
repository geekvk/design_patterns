package org.example.pizzahut_abstractfactory;

public class ChilliePizza extends Pizza{
    private Topping topping;

    public ChilliePizza(Topping topping) {
        this.topping = topping;
    }

    @Override
    public void addIngredients() {
        System.out.println("Chille pizza");
        topping.createSource();
        topping.createChese();
    }
}
