package com.castelao;


public class CalcBasic {
 // Creacion de variables con las que el usuario selecciona que operacion hacer//

    public static final int SUMA = 1;
  
    public static final int RESTA = 2;
 
    public static final int MULTIPLICACION = 3;
   
    public static final int DIVISION = 4;
  
    public static final int RAIZ = 5;
  
    public static final float[] RESULTADO= new float[1];


 
    public static float[] operacion(float numero1, float numero2, int opcion) {

       


        switch (opcion) {

            case SUMA:
                try {
                    RESULTADO[0] = numero1 + numero2;
                } catch (NullPointerException exception) {
                    return null;
                }

                return RESULTADO;

            case RESTA:

                try {
                    RESULTADO[0] = numero1 - numero2;
                } catch (NullPointerException exception) {
                    return null;
                }

                return RESULTADO;

            case MULTIPLICACION:

                try {
                    RESULTADO[0] = numero1 * numero2;
                } catch (NullPointerException exception) {
                    return null;
                }

                return RESULTADO;

            case DIVISION:

                try {
                    RESULTADO[0] = Math.round(numero1 / numero2);
                } catch (NullPointerException exception) {
                    return null;
                }

                return RESULTADO;

            case RAIZ:
                try {
                    RESULTADO[0] = (float) Math.pow(numero1, 1/numero2);
                } catch (NullPointerException exception) {
                    return null;
                }
                return RESULTADO;

            default:

                return null;
        }
    }
}
