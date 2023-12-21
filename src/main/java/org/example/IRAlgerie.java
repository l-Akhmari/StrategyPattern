package org.example;

public class IRAlgerie implements CalculeIGRStategy{
    @Override
    public float CalculIR(float salireBrutAnnuel) {
        System.out.println("calculer l'IR pour l'algerie");
        return salireBrutAnnuel*35/100;
    }
}
