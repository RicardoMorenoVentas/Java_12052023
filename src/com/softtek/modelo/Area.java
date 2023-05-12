package com.softtek.modelo;

public class Area {

    public static double calcularAreaCirculo(double radius){
        return Math.PI * radius * radius;
    }

    public static double calcularAreaRectangulo(double base, double altura){
        return base * altura;
    }
}
