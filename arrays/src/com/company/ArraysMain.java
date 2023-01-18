package com.company;

public class ArraysMain {
    public static void main(String[] args) {
        int [] notas = new int[10];
        int [] notas2 = {8,10,5,9,8,7,5,6};

        notas[0] = 8;
        notas[1] = 9;

        System.out.println(notas[0]); // 8

        for (int i = 0; i < notas2.length; i++) {
            System.out.println(notas2[i]);  // 8 10 5 9 8 7 5 6
        }



    }
}
