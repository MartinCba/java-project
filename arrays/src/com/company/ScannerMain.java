package com.company;

import java.util.Scanner;

public class ScannerMain {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Por favor introduce un nombre");
        String nombre = teclado.nextLine();
        System.out.println("Introduce tu edad");
        int edad = teclado.nextInt();

        System.out.println("Hola " + nombre + " tienes " + edad + " años de edad!");
    }
}
