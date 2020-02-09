package com.mycompany.boletin18_2y3;

import java.util.Scanner;

/**
 *
 * @author jaimg
 */
public class Metodos {

    int[] notas = new int[30];
    String[] nombres = new String[30];
    String[] aprobados = new String[notas.length];

    public void crearArrayRandom() {
        for (int i = 0; i < notas.length; i++) {
            notas[i] = (int) (Math.random() * (10 + 1));
        }
    }

    public void mostrarArrayNotas() {
        for (int i = 0; i < notas.length; i++) {
            System.out.println(notas[i]);
        }
    }

    public void contarAprobadosSuspensos() {
        int aprob = 0, suspensos = 0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= 5) {
                aprob++;
            } else {
                suspensos++;
            }
        }
        System.out.println("Numero de aprobados: " + aprob
                + "\nNumero de suspensos: " + suspensos);
    }

    public float calcularNotaMedia() {
        float total = 0;
        for (int i = 0; i < notas.length; i++) {
            total = total + notas[i];
        }
        return total / notas.length;
    }

    public void amosarNotaAlta() {
        int notaMax = 0;
        for (int i = 0; i < notas.length; i++) {
            if (i == 0) {
                notaMax = notas[i];
            }
            if (notas[i] > notaMax) {
                notaMax = notas[i];
            }
        }
        System.out.println("La nota más alta es: " + notaMax);
    }

    public void crearArrayNomes() {
        int acumulador = 1;
        for (int i = 0; i < nombres.length; i++) {
            int numero = (int) (Math.random() * 8 + 1);
            switch (numero) {
                case 1:
                    nombres[i] = "Manuel " + acumulador;
                    acumulador++;
                    break;
                case 2:
                    nombres[i] = "Lucia " + acumulador;
                    acumulador++;
                    break;
                case 3:
                    nombres[i] = "Juan " + acumulador;
                    acumulador++;
                    break;
                case 4:
                    nombres[i] = "Javier " + acumulador;
                    acumulador++;
                    break;
                case 5:
                    nombres[i] = "Jaime " + acumulador;
                    acumulador++;
                    break;
                case 6:
                    nombres[i] = "Alexia " + acumulador;
                    acumulador++;
                    break;
                case 7:
                    nombres[i] = "Laura " + acumulador;
                    acumulador++;
                    break;
                case 8:
                    nombres[i] = "Ana " + acumulador;
                    acumulador++;
                    break;
            }
        }
    }

    public void mostrarArrayNombres() {
        for (String nome : nombres) {
            System.out.println(nome);
        }
    }

    public void visualizarNotaAlumno() {
        Scanner sc = new Scanner(System.in);
        int aux = 0;
        String nomeIntroducido;
        System.out.println("Introduce el nombre: ");
        nomeIntroducido = sc.nextLine();
        for (int i = 0; i < nombres.length; i++) {
            if (nomeIntroducido.equals(nombres[i])) {
                aux = i;
                break;
            }
        }
        System.out.println("Nota: " + notas[aux]);
    }

    public void visualizarAlumnosAprobados() {
        System.out.println("Aprobados: ");
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= 5) {
                System.out.println(nombres[i]);
            }

        }
    }

    public void listaAprobados() {
        int j = 0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= 5) {
                aprobados[j] = nombres[i];
                j++;
            }
        }
    }

    public void mostrarListaAprobados() {
        listaAprobados();
        for (String aprobado : aprobados) {
            System.out.println(aprobado);
        }
    }

    public void mostrarArrays() {
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota: " + notas[i] + "  Nobrme: " + nombres[i]);
        }
    }

    public void ordencrecienteArrays() {
        int aux;
        String auxNombre;
        for (int i = 0; i < notas.length - 1; i++) {
            for (int j = i + 1; j < nombres.length; j++) {
                if (notas[i] > notas[j]) {
                    aux = notas[i];
                    notas[i] = notas[j];
                    notas[j] = aux;
                    auxNombre = nombres[i];
                    nombres[i] = nombres[j];
                    nombres[j] = auxNombre;
                }
            }
            mostrarArrays();
        }
    }

    public void hacerMenu() {
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.println("1-Visualizar la nota de un alumno determinado\n" + "2-Visualizar una lista con el nombre de los alumnos aprobados.\n" + "3-Visualizar una lista ordenada por orden creciente de notas\n" + "4-Salir  ");
            num = sc.nextInt();
            switch (num) {
                case 1:
                    visualizarNotaAlumno();
                    break;
                case 2:
                    mostrarListaAprobados();
                    break;
                case 3:
                    ordencrecienteArrays();
                    break;
                case 4:
                    break;

            }
        } while (num != 4);
    }

}






