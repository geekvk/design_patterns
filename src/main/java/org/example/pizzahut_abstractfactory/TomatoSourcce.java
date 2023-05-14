package org.example.pizzahut_abstractfactory;

public class TomatoSourcce implements Source{
    @Override
    public void prepareSource() {
        System.out.println("Tomato source is ready");
    }
}
