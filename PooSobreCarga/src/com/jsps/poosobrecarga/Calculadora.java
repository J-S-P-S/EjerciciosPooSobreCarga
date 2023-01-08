package com.jsps.poosobrecarga;

public class Calculadora {

    private Calculadora() {
    }

    public static int sumar(int a, int b) {
        return a + b;
    }

    public static int sumar(int... argumentos){ //Varargs para crear un método que reciba n cantidad de argumentos y no crear varias sobrecargas
        int total = 0;
        for (int i:argumentos){
            total += i;
        }
        return  total;
    }

    public static float sumar(float a, int... argumentos){ //Varargs incluso se pueden combinar diferentes tipos de argumentos.
        float total = a;
        for (int i:argumentos){
            total += i;
        }
        return  total;
    }

    public static float sumar(float a, float b) {
        return a + b;
    }

    public static float sumar(int a, float b) {
        return a + b;
    }

    public static float sumar(float a, int b) {
        return a + b;
    }

    public static double sumar(double a, double b) {
        return a + b;
    }

    public static int sumar(String a, String b) {
        int r;
        try {
            r = Integer.parseInt(a) + Integer.parseInt(b);
        } catch (NumberFormatException e) {
            r = 0;
        }
        return r;
    }

    public static int sumar(int a, int b, int c){
        return a + b + c;
    }

}