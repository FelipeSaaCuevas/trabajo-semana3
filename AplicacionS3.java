/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aplicacion.s3;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class AplicacionS3 {
scaner sc = new scanner(System.in);
string Marca ;
string Modelo  ;
int Cilindrada ;
string Tipo_de_Combustible  ;
int numero_de_personas  ;
int km;
System.out.println("escriva la marca");
Stirng Marca = sc.nextline();
system.out.println("escriva el modelo");
String Modelo = sc.nextline();
System.out.println("escriva la cilindrada");
int Cilindrada = sc.nextint();
System.out.println("escriva el tipo de combustible");
String Tipo_de_Combustible = sc.nextline();
System.out.println("escriva el numero de personas");
int numero_de_personas = sc.nextint();
system.out.println("cuentos kilometros")
int km = sc.nextint();
system.out.println("cuento paga")
int Dinero = sc.nextint();
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
                    System.out.println("Su cuenta es de " + total +", por " + Marca + " " + Modelo +", cilindrada de motor: " + Cilindrada +", tipo de combustible: " + Tipo_de_Combustible +", número de personas: " + numero_de_personas);
                } else {
                    int ex = 1;
                    int total = ex * Dinero;
                    System.out.println("Su cuenta es de " + total +", por " + Marca + " " + Modelo +", cilindrada de motor: " + Cilindrada +", tipo de combustible: " + Tipo_de_Combustible +", número de personas: " + numero_de_personas);
                }
                break;

            case 2:
                if (km >= 20) {
                    System.out.println("Se cobra un monto extra por sobrepasar los 20 km");
                    int ex = 150;
                    int total = ex * Dinero;
                    System.out.println("Su cuenta es de " + total +", por " + Marca + " " + Modelo +", cilindrada de motor: " + Cilindrada +", tipo de combustible: " + Tipo_de_Combustible +", número de personas: " + numero_de_personas);
                } else {
                    int ex = 1;
                    int total = ex * Dinero;
                    System.out.println("Su cuenta es de " + total +", por " + Marca + " " + Modelo +", cilindrada de motor: " + Cilindrada +", tipo de combustible: " + Tipo_de_Combustible +", número de personas: " + numero_de_personas);
                }
                break;
        }

        sc.close();
    }
}
