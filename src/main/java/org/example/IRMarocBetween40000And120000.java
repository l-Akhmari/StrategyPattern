package org.example;

public class IRMarocBetween40000And120000 implements CalculeIGRStategy{
    @Override
    public float CalculIR(float salireBrutAnnuel) {
        System.out.println("Calcul l'IR pour un salaire annuel entre 40000 et 120000 :");
        return salireBrutAnnuel*20/100;
    }
}
