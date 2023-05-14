package org.example.abstractfactory;

public class PetDog implements Dog{

    public PetDog() {
        System.out.println("Pet Dog");
    }

    @Override
    public void speak() {
        System.out.println("Pet dog speak");
    }

    @Override
    public void action() {
        System.out.println("Pet dog actions");
    }
}
