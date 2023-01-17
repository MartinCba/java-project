package com.company;

public class CocheElectrico extends Coche{
    String motorElectrico;
    public CocheElectrico(){
    };
    public CocheElectrico(String motorElectrico){
    };

    @Override
    public String toString() {
        return "CocheElectrico{" +
                "color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", velocidad=" + velocidad +
                ", motorElectrico='" + motorElectrico + '\'' +
                '}';
    }
}
