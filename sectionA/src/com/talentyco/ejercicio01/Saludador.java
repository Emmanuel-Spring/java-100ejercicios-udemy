package com.talentyco.ejercicio01;

import java.util.Scanner;

/**  Java Title: Ejercicio N° 02
 @author Emmanuel Nieto Muñoz
 @version: 14/12/2021/1.0

 @param Pide un nombre por consola y saluda por consola
 */
public class Saludador {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");

        System.out.println("Escribe un nombre: ");
        String nombre = scanner.next();

        System.out.println("¡¡¡ Hola " + nombre + " !!!");

    }
}
