package org.example.abstractfactory_pizza.topping;

import org.example.pizzahut_abstractfactory.Chese;
import org.example.pizzahut_abstractfactory.MozzarellaChese;
import org.example.pizzahut_abstractfactory.Source;
import org.example.pizzahut_abstractfactory.TomatoSourcce;

public class SilicoToppingImpl implements ITopping{
    @Override
    public Chese createChese() {
        return new MozzarellaChese();
    }

    @Override
    public Source createSource() {
        return new TomatoSourcce();
    }
}
