package org.example.abstractfactory;

public class PetTiger implements Tiger{
    public PetTiger() {
        System.out.println("Pet Tiger");
    }

    @Override
    public void speak() {
        System.out.println("Pet tigr speaks");
    }

    @Override
    public void action() {
        System.out.println("Pet tiger action");
    }
}
