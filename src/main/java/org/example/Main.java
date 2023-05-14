package org.example;

import org.example.abstractfactory.*;
import org.example.abstractfactory_pizza.pizzafactory.ItalianPizza;
import org.example.abstractfactory_pizza.pizzafactory.PizzaFactory;
import org.example.pizzahut_abstractfactory.Pizza;
import org.example.pizzahut_abstractfactory.SiliconPizzaFactory;

public class Main {
    public static void main(String[] args) {

//        AnimalFactory petAnimalFactory = new PetAnimalFactory();
//        Dog petDog = petAnimalFactory.createDog();
//        petDog.action();
//        petDog.speak();
//        System.out.println("********");
//        AnimalFactory wildAnimalFactory = new WildAnimalFactory();
//        Tiger wildTiger = wildAnimalFactory.createTiger();
//        wildTiger.action();
//        wildTiger.speak();
//        PizzaFactory slilicon = new SiliconPizzaFactory();
//        Pizza myPizza = slilicon.createPizza("chese");
        PizzaFactory pizzaFactory = new ItalianPizza();
        pizzaFactory.createPizza("chese");




    }
}