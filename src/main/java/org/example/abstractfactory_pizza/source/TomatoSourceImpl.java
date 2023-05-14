package org.example.abstractfactory_pizza.source;

public class TomatoSourceImpl implements ISource{
    @Override
    public void prepareSource() {
        System.out.println("Tomato source");
    }
}
