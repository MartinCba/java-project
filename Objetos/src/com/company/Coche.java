package com.company;

public abstract class Coche {

    // atributos
    String color;
    String fabricante;
    String modelo;
    Double peso;
    Double largo;
    Integer velocidad = 0;

    // constructores

    public Coche(String color, String fabricante, String modelo, Double peso, Double largo) {
        this.color = color;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.peso = peso;
        this.largo = largo;
    }

    public Coche() {
    }
    // comportamiento

    public void acelerar(Integer cantidad){
        if (cantidad > 0 && cantidad <= 520) {
            this.velocidad += cantidad;
        }
    }

    @Override
    public String toString() {
        return "Coche{" +
                "color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso + " Kg"+
                ", largo=" + largo + " Mts" +
                ", velocidad=" + velocidad + " Km/h" +
                '}';
    }
}
