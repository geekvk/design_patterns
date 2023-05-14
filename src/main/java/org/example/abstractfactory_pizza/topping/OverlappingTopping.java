package org.example.abstractfactory_pizza.topping;

import org.example.pizzahut_abstractfactory.Chese;
import org.example.pizzahut_abstractfactory.ChilleSource;
import org.example.pizzahut_abstractfactory.GoatChese;
import org.example.pizzahut_abstractfactory.Source;

public class OverlappingTopping implements ITopping{
    @Override
    public Chese createChese() {
        return new GoatChese();
    }

    @Override
    public Source createSource() {
        return new ChilleSource();
    }
}
