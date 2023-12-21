package org.example;

public class Employe {
    private String cin;
    private float salaireBrutMensuel;

    public void setCalculeIGRStategy(CalculeIGRStategy calculeIGRStategy) {
        this.calculeIGRStategy = calculeIGRStategy;
    }

    private CalculeIGRStategy calculeIGRStategy;

    public Employe(String cin, float salaireBrutMensuel) {
        this.cin = cin;
        this.salaireBrutMensuel = salaireBrutMensuel;
    }
    public float calculerIGR(){
        System.out.println("-----------");
        float salaireBrutAnuel=salaireBrutMensuel*12;
        return calculeIGRStategy.CalculIR(salaireBrutAnuel);
    }
    public float getSalaireNetMensuel(){
        float igr=calculerIGR();
        float salaireNetAnuel=salaireBrutMensuel*12-igr;
        return salaireNetAnuel/12;

    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public float getSalaireBrutMensuel() {
        return salaireBrutMensuel;
    }

    public void setSalaireBrutMensuel(float salaireBrutMensuel) {
        this.salaireBrutMensuel = salaireBrutMensuel;
    }
}
