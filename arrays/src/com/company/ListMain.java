package com.company;
import java.util.ArrayList;
import  java.util.List;
public class ListMain {
    public static void main(String[] args) {

        List<String> nombres = new ArrayList<String>();

        nombres.add("Nombre 1");
        nombres.add("Nombre 2");
        nombres.add("Nombre 3");
        nombres.add("Nombre 4");

        System.out.println(nombres);

        for (String item:nombres) {
            System.out.println(item);
        }

        List<Coche> coches = new ArrayList<Coche>();

        coches.add(new Coche("Renault"));
        coches.add(new Coche("Citroen"));
        coches.add(new Coche("Fiat"));
        coches.add(new Coche("Suzuki"));
        coches.add(new Coche("Toyota"));
        coches.add(new Coche("Nissan"));

        for (Coche auto:coches) {
            System.out.println(auto);
        }

    }
}
