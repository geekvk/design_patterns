package org.example.pizzahut_abstractfactory;

public class CreamTopping implements Topping{
    @Override
    public Chese createChese() {
        return new GoatChese();
    }

    @Override
    public Source createSource() {
        return new TomatoSourcce();
    }
}
