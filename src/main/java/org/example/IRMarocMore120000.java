package org.example;

public class IRMarocMore120000 implements CalculeIGRStategy{
    @Override
    public float CalculIR(float salireBrutAnnuel) {
        System.out.println("Calcul l'IR pour un salaire annuel supérieur à 120000 :");
        return salireBrutAnnuel*42/100;
    }
}
