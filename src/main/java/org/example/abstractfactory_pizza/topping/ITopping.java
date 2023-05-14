package org.example.abstractfactory_pizza.topping;

import org.example.pizzahut_abstractfactory.Chese;
import org.example.pizzahut_abstractfactory.Source;

public interface ITopping {
    Chese createChese();
    Source createSource();
}
