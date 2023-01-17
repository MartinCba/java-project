package com.company;

public class CocheMain {
    public static void main(String[] args) {
        Coche cocheObj = new Coche("negro", "Lamborghini", "Diablo", 750.0, 2.5);

        cocheObj.acelerar(375);
        cocheObj.peso = 980.0;
        System.out.println(cocheObj);

        CocheElectrico cocheElectrico = new CocheElectrico();
        cocheElectrico.motorElectrico= "rx-8 Electrico";
        cocheElectrico.color = "Blanco";
        cocheElectrico.fabricante = "Ferrari";
        cocheElectrico.modelo = "F-40";
        System.out.println(cocheElectrico);

        CocheHibrido cocheHibrido = new CocheHibrido("Rojo", "Mclaren", "D-1000", 1230.0, 2.9, "Rtx- Hibrido");
        cocheHibrido.acelerar(400);
        System.out.println(cocheHibrido);
    }
}
