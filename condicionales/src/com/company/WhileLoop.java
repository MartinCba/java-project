package com.company;

public class WhileLoop {
    public static void main(String[] args) {
        boolean check = true;
        int count = 0;

        while (count < 10){
            count ++;
            if (count == 6){
                break;      // break rompe el flujo de ejecucuion
                //continue; // continue salta el valor 6 y continua a la siguiente iteracion
            }
            System.out.println("Hola mundo " + count);
        }
        System.out.println("Fin...");
    }
}
