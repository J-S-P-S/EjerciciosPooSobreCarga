package com.jsps.poosobrecarga;

import static com.jsps.poosobrecarga.Calculadora.*;

public class SobreCarga {

    public static void main(String[] args) {

        System.out.println("sumar int: " + sumar(10,5) );
        System.out.println("sumar float: " + sumar(10.0F,5F));
        System.out.println("sumar float-int: " + sumar(10.0F,5));
        System.out.println("sumar int-float: " + sumar(10,5.0F));
        System.out.println("sumar double:" + sumar(10.0,10.0));
        System.out.println("sumar string: " + sumar("10","5"));
        System.out.println("sumar 3 int: " + sumar(10,5,3));
        System.out.println("sumar 6 int: " + sumar(10,5,3,4,5,6));//Sobrecarga con Varargs
        System.out.println("sumar float + n int: " + sumar(10.5F,5,9,15));//Sobrecarga con Varargs y argumentos combinados

        System.out.println("sumar long: " + sumar(10L,5L));
        System.out.println("sumar int: " + sumar(10,'@'));
        System.out.println("sumar float-int: " + sumar(10F, '@'));


    }
}