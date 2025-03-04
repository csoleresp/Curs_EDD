package com.ieseljust.edd;

public class Calculadora {

    public static int suma(int a, int b){
        return a + b;
    }

    public static int resta(int a, int b){
        return a - b;
    }

    public static int multiplica(int a, int b){
        return a * b;
    }

    public static int divideix(int a, int b){
        try{
            return a / b;
        }
        catch(Exception e){
            System.out.println(e);
            return 0;
        }
    }
}