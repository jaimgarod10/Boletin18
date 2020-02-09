package com.mycompany.boletin18_2y3;

/**
 *
 * @author jaimgarod10
 */
public class Bol_2y3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Metodos a = new Metodos();
        a.crearArrayRandom();
        a.contarAprobadosSuspensos();
        System.out.println("Nota media: " + a.calcularNotaMedia());
        a.amosarNotaAlta();
        a.crearArrayNomes();
        a.mostrarArrays();
        a.hacerMenu();

    }

}

