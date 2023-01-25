package com.company;

public class Ejercicio1 {
    public static void main(String[] args) {
        System.out.println(Suma(2, 5, 7));
        Coche auto = new Coche(3);
        System.out.println(auto);
        auto.IncrementarPuertas();
        System.out.println(auto);
    }

    // primera parte
    public static int Suma(int a, int b, int c) {
        return a + b + c;
    }

}
