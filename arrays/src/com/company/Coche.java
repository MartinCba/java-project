package com.company;

public class Coche {
    String marca = "nombre de coche";

    public Coche(String marca) {
        this.marca = marca;
    }

    public Coche() {
    }

    @Override
    public String toString() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                '}';
    }
}
