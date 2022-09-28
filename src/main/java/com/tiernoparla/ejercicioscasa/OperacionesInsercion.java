package com.tiernoparla.ejercicioscasa;

import java.util.Scanner; //Para poder usar la inserción de numeros por teclado

public class OperacionesInsercion {
    public static void main(String[] args) {
        
        Scanner reader = new Scanner (System.in); //Para crear la clase leer, tipo Scanner
        
        int a;
        int b;
        
        
        System.out.println("Introduce el primer numero:");
        a = reader.nextInt();
        
        System.out.println("Introduce el segundo numero:");
        b = reader.nextInt();
        
        int c = a+b;
        
        System.out.println("La suma de " + a + " + " + b + " = " + c );
    
    } //main
    
} //OperacionesInsercion
