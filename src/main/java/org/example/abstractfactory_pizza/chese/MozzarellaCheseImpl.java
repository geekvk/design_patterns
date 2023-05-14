package org.example.abstractfactory_pizza.chese;

import org.example.abstractfactory_pizza.chese.IChease;

public class MozzarellaCheseImpl implements IChease {
    @Override
    public void prepareChese() {
        System.out.println("Mozzarella Chase");
    }
}
