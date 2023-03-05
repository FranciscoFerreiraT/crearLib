package com.castelao;

public class Operaciones {
    public static void operacionesBasicasConTryCatch(double num1, double num2) {


        try {
            double suma = num1 + num2;
            double resta = num1 - num2;
            double multiplicacion = num1 * num2;
            double division = num1 / num2;


            System.out.println("Suma: " + suma);
            System.out.println("Resta: " + resta);
            System.out.println("Multiplicación: " + multiplicacion);
            System.out.println("División: " + division);
        } catch (ArithmeticException e) {
            System.out.println("Error ");
        }
    }
}