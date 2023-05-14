package org.example.abstractfactory;

public class WildTiger implements Tiger{
    @Override
    public void speak() {
        System.out.println("Wild tiger speaks");
    }

    @Override
    public void action() {
        System.out.println("Wild tiger action");
    }
}
