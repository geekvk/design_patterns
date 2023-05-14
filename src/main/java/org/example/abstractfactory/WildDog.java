package org.example.abstractfactory;

public class WildDog implements Dog{
    @Override
    public void speak() {
        System.out.println("Wild dog speak");
    }

    @Override
    public void action() {
        System.out.println("Wild dog action");
    }
}
