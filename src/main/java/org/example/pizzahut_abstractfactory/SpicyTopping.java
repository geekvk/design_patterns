package org.example.pizzahut_abstractfactory;

public class SpicyTopping implements Topping{
    @Override
    public Chese createChese() {
        return new MozzarellaChese();
    }

    @Override
    public Source createSource() {
        return new ChilleSource();
    }
}
