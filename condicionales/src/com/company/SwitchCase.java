package com.company;

public class SwitchCase {
    public static void main(String[] args) {
        String weather = "fff";

        switch (weather){
            case "sunny":
                System.out.println("El tiempo es soleado");
                break;
            case "rain":
                System.out.println("El tiempo es lluvioso");
                break;
            case "cloudy":
                System.out.println("El tiempo es nublado");
                break;
            default:
                System.out.println("No se ha podido identificar el clima");
                break;
        }
    }
}
