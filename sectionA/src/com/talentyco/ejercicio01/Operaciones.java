package com.talentyco.ejercicio01;

import java.util.Scanner;

/**  Java Title: Ejercicio N° 03
 @author Emmanuel Nieto Muñoz
 @version: 14/12/2021/1.0
 @see <a href = "https://www.udemy.com/course/aprende-java-con-100-ejercicios-practicos/learn/lecture/11037430#overview" />Ejercicio Número 01 </a>

 @param Pide dos números por consola y muetra su suma, resta, multiplicación y división.
 */

public class Operaciones {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe el número 1: ");
        int num1 = scanner.nextInt();

        System.out.println("Escribe el número 2: ");
        int num2 = scanner.nextInt();

        int suma = num1 + num2;
        System.out.println("La suma es: " + suma);

        int resta = num1 - num2;
        System.out.println("La resta es: " + resta);

        int multiplicacion = num1 * num2;
        System.out.println("La multiplicacion es: " + multiplicacion);


        if (num2 == 0) {
            System.out.println("No puedes dividir por cero (0)");
        } else {
            double division = num1 / num2;
            System.out.println("La división es: " + division);
        }
    }
}
