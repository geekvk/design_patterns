package org.example.abstractfactory_pizza.source;

public class ChillieSourceImpl implements ISource{
    @Override
    public void prepareSource() {
        System.out.println("Chillie source");
    }
}
