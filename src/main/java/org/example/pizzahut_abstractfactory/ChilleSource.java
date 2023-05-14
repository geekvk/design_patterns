package org.example.pizzahut_abstractfactory;

public class ChilleSource implements Source{
    @Override
    public void prepareSource() {
        System.out.println("Chile source is ready");
    }
}
