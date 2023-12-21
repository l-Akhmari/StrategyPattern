package org.example;

public class Main {
    public static void main(String[] args) {
        Employe employe1 = new Employe("A100",10000);
        Employe employe2 = new Employe("A101",3000);
        employe1.setCalculeIGRStategy(new IRMarocBetween40000And120000());
        employe2.setCalculeIGRStategy(new IRMarocLess40000());
        System.out.println(employe1.calculerIGR());
        System.out.println(employe2.calculerIGR());

    }
}