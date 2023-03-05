package com.castelao;

public class Operaciones {
    public static void operaciones(double num1, double num2) {


        try {
            double suma = num1 + num2;
            double resta = num1 - num2;
            double multiplicacion = num1 * num2;
            double division = num1 / num2;
            double raizCuadrada1 = Math.sqrt(num1);
            double raizCuadrada2 = Math.sqrt(num2);

            System.out.println("La suma de " + num1 + " y " + num2 + " es: " + suma);
            System.out.println("La resta de " + num1 + " y " + num2 + " es: " + resta);
            System.out.println("La multiplicación de " + num1 + " y " + num2 + " es: " + multiplicacion);
            System.out.println("La división de " + num1 + " y " + num2 + " es: " + division);
            System.out.println("La raíz cuadrada de " + num1 + " es: " + raizCuadrada1);
            System.out.println("La raíz cuadrada de " + num2 + " es: " + raizCuadrada2);

        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    }