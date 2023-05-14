package org.example.pizzahut_abstractfactory;

public class GoatChese implements Chese{
    @Override
    public void prepareChese() {
        System.out.println("Goat Chese ready");
    }
}
