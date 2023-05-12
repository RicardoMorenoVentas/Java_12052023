package com.softtek.modelo;

public class Dado {
    private int maximo;

    private int minimo;

    public Dado(int maximo, int minimo) {
        this.maximo = maximo;
        this.minimo = minimo;
    }

    public Dado(){
        this.maximo = 6;
        this.minimo = 1;
    }

    public int lanzarDado(){
        return Math.round((float)Math.random() * (maximo - minimo) + minimo);
    }
}
