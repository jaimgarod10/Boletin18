package com.mycompany.boletin18_4;

/**
 *
 * @author jaimg
 */
public class Metodos {

    int[] numeros = new int[23];
    char[] letras = new char[23];

    public void crearArrays() {
        numeros[0] = 3;
        letras[0] = 'A';
        numeros[1] = 11;
        letras[1] = 'B';
        numeros[2] = 20;
        letras[2] = 'C';
        numeros[3] = 9;
        letras[3] = 'D';
        numeros[4] = 22;
        letras[4] = 'E';
        numeros[5] = 7;
        letras[5] = 'F';
        numeros[6] = 4;
        letras[6] = 'G';
        numeros[7] = 18;
        letras[7] = 'H';
        numeros[8] = 13;
        letras[8] = 'J';
        numeros[9] = 21;
        letras[9] = 'K';
        numeros[10] = 19;
        letras[10] = 'L';
        numeros[11] = 5;
        letras[11] = 'M';
        numeros[12] = 12;
        letras[12] = 'N';
        numeros[13] = 8;
        letras[13] = 'P';
        numeros[14] = 16;
        letras[14] = 'Q';
        numeros[15] = 1;
        letras[15] = 'R';
        numeros[16] = 15;
        letras[16] = 'S';
        numeros[17] = 0;
        letras[17] = 'T';
        numeros[18] = 17;
        letras[18] = 'V';
        numeros[19] = 2;
        letras[19] = 'W';
        numeros[20] = 10;
        letras[20] = 'X';
        numeros[21] = 6;
        letras[21] = 'Y';
        numeros[22] = 14;
        letras[22] = 'Z';
    }

    public void mostrarArrays(){
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Numero: " + numeros[i] + "  Letra: " + letras[i]);
        }
    }

    public void buscarElemento(int elemBuscar) {
        int i;
        int atopado = 0;
        for (i = 0; i < numeros.length; i++) {
            if (elemBuscar == numeros[i]) {
                atopado = 1;
                break;
            }
        }
        if (atopado == 0) {
            System.out.println("No está");
        } else {
            System.out.println("La letra es: " + letras[i]);

        }
    }

    public void calcularLetra(int dni) {
        int resto = dni % 23;
        buscarElemento(resto);

    }

}



