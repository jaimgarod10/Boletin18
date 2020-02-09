package com.mycompany.boletin18;

import java.util.Random;

/**
 *
 * @author jaimg
 */
public class Metodos {

    int[] numeros = new int[6];

    public void crearArrayRandom() {
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 50 + 1);
        }

    }

    public void amosarArray() {
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }

    public void amosarArrayReves() {
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println(numeros[i]);
        }
    }

}

