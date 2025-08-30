/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aplicacion.s3;

import java.util.Scanner;

public class AplicacionS3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String Marca;
        String Modelo;
        int Cilindrada;
        String Tipo_de_Combustible;
        int numero_de_personas;
        int km;

        System.out.println("Escriba la marca");
        Marca = sc.nextLine();

        System.out.println("Escriba el modelo");
        Modelo = sc.nextLine();

        System.out.println("Escriba la cilindrada");
        Cilindrada = sc.nextInt();
        sc.nextLine(); // limpiar buffer

        System.out.println("Escriba el tipo de combustible");
        Tipo_de_Combustible = sc.nextLine();

        System.out.println("Escriba el número de personas");
        numero_de_personas = sc.nextInt();

        System.out.println("¿Cuántos kilómetros?");
        km = sc.nextInt();

        System.out.println("¿Cuánto paga?");
        int Dinero = sc.nextInt();

        int opciones;
        if (Dinero > 49999) {
            opciones = 1;
        } else {
            opciones = 2;
        }

        switch (opciones) {
            case 1:
                if (km >= 20) {
                    System.out.println("Se cobra un monto extra por sobrepasar los 20 km");
                    int ex = 150;
                    int total = ex * Dinero;
                    System.out.println("Su cuenta es de " + total + ", por " + Marca + " " + Modelo +
                            ", cilindrada de motor: " + Cilindrada +
                            ", tipo de combustible: " + Tipo_de_Combustible +
                            ", número de personas: " + numero_de_personas);
                } else {
                    int ex = 1;
                    int total = ex * Dinero;
                    System.out.println("Su cuenta es de " + total + ", por " + Marca + " " + Modelo +
                            ", cilindrada de motor: " + Cilindrada +
                            ", tipo de combustible: " + Tipo_de_Combustible +
                            ", número de personas: " + numero_de_personas);
                }
                break;

            case 2:
                if (km >= 20) {
                    System.out.println("Se cobra un monto extra por sobrepasar los 20 km");
                    int ex = 150;
                    int total = ex * Dinero;
                    System.out.println("Su cuenta es de " + total + ", por " + Marca + " " + Modelo +
                            ", cilindrada de motor: " + Cilindrada +
                            ", tipo de combustible: " + Tipo_de_Combustible +
                            ", número de personas: " + numero_de_personas);
                } else {
                    int ex = 1;
                    int total = ex * Dinero;
                    System.out.println("Su cuenta es de " + total + ", por " + Marca + " " + Modelo +
                            ", cilindrada de motor: " + Cilindrada +
                            ", tipo de combustible: " + Tipo_de_Combustible +
                            ", número de personas: " + numero_de_personas);
                }
                break;
        }

        sc.close();
    }
}
