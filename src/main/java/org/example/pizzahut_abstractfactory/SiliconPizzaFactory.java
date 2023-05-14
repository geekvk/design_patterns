package org.example.pizzahut_abstractfactory;

public class SiliconPizzaFactory implements PizzaFactory{
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza;
        Topping spicy = new SpicyTopping();
        switch (type){
            case "chese":
                pizza = new ChesePizza(spicy);
                break;
            case "chille":
                pizza = new ChilliePizza(spicy);
            default:
                throw new IllegalArgumentException("Type is invalid");
        }
        pizza.addIngredients();
        pizza.bakePizza();
        return pizza;
    }
}
