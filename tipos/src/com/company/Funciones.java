package com.company;

public class Funciones {
    public static void main(String[] args) {
        holaMundo();
        devolverHolaMundo("Martín");
        holaMundo();
        devolverHolaMundo("Luca");
        holaMundo();
        devolverHolaMundo("Julian");
        String hola = chauMundo();
        System.out.println(hola);
    }

    private static String chauMundo() {
        return "Chau mundo!!";
    }

    protected static void devolverHolaMundo(String name) {
        System.out.println("Hola "+ name);
    }

    public static void holaMundo() {
        System.out.println("Hola mundo!!!!");
    }

    private static int sum(int num1, int num2) {
        return num1 + num2;
    }
}
