package org.example;

public class IRMarocLess40000 implements CalculeIGRStategy{
    @Override
    public float CalculIR(float salireBrutAnnuel) {
        System.out.println("Calcul l'IR pour un salaire annuel inferieur à 40000 :");
        return salireBrutAnnuel*5/100;
    }
}
