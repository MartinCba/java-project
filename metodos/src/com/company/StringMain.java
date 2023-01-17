package com.company;

public class StringMain {
    public static void main(String[] args) {
        // La clase Strign
        /*
        length()
        startsWith("")
        endsWith("")
        indexOf("")
        substring(1,5)
        trim()
        equals()
        compareTo("")
         */

        String mensaje = "  Hola mundo   ";

        System.out.println(mensaje.length());
        String mensaheMAY = mensaje.toUpperCase();
        System.out.println(mensaheMAY);
        System.out.println(mensaheMAY.trim());

        String otro = "HOLA MUNDO";
        if (mensaheMAY.equals(otro)) {
            System.out.println("Verdadero");
        }else {
            System.out.println("Falso");
        }



    }
}
