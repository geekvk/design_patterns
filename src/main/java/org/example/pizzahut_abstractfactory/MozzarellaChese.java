package org.example.pizzahut_abstractfactory;

public class MozzarellaChese implements Chese{
    @Override
    public void prepareChese() {
        System.out.println("Mozzeralla chese ready");
    }
}
