package com.talentyco.ejercicio01;

import java.util.Scanner;

/**  Java Title: Ejercicio N° 04
 @author Emmanuel Nieto Muñoz
 @version: 14/12/2021/1.0
 @see <a href = "https://www.udemy.com/course/aprende-java-con-100-ejercicios-practicos/learn/lecture/11037430#overview" />Ejercicio Número 01 </a>

 @param Pide 2 números por consola e indica cual es el menor de los 2 números,
        En caso de que sean iguales, también lo debes indicar.
 */

public class Menor {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserta el primer número: ");
        int num1 = scanner.nextInt();

        System.out.println("Inserta el segundo número: ");
        int num2 = scanner.nextInt();

        if (num1 <= num2) {
            if ( num1 == num2 ) {
                System.out.println("Los números son iguales");
            } else {
                System.out.println("El número 1 es menor que el número 2");
            }
        } else {
            System.out.println("El número 2 es menor que el número 1");
        }
    }
}
