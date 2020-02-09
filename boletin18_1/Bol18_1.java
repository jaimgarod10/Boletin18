package com.mycompany.boletin18;

import java.util.Arrays;

/**
 *
 * @author jaimg
 */
public class Bol18_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Metodos obj = new Metodos();
        obj.crearArrayRandom();
        System.out.println("Array:");
        obj.amosarArray();
        System.out.println("\n Al reves:");
        obj.amosarArrayReves();

    }
}

