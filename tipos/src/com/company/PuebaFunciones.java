package com.company;

public class PuebaFunciones {
    public static void main(String[] args) {
        Funciones.holaMundo();
        Funciones.devolverHolaMundo("Martín");
        hola();
        hola("Martín");
        hola("Martín", "Hernandez");
    }

    private static void hola() {
        System.out.println("Hola!");
    }
    private static void hola(String name) {
        System.out.println("Hola " + name + "!");
    }
    private static void hola(String name, String surname) {
        System.out.println("Hola " + name + " " + surname + "!");
    }
}
