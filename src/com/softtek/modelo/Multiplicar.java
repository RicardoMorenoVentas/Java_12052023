package com.softtek.modelo;

public class Multiplicar {

    private int num_base;
    public Multiplicar(int num_base){
        this.num_base = num_base;
    }

    public Multiplicar(){
        this.num_base = 2;
    }

    public String tabla(){
        String tabla = "";
        for(int i = 1; i <= 10; i++){
            tabla += i + " * " + this.num_base + " = " + i*this.num_base;
            tabla += "\n";
        }
        return tabla;
    }
}
