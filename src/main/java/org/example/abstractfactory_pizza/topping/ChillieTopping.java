package org.example.abstractfactory_pizza.topping;

import org.example.pizzahut_abstractfactory.Chese;
import org.example.pizzahut_abstractfactory.ChilleSource;
import org.example.pizzahut_abstractfactory.MozzarellaChese;
import org.example.pizzahut_abstractfactory.Source;

public class ChillieTopping implements ITopping{
    @Override
    public Chese createChese() {
        return new MozzarellaChese();
    }

    @Override
    public Source createSource() {
        return new ChilleSource();
    }
}
