package com.softtek.modelo;

import java.util.ArrayList;

public class Campos {
    private int x;

    public Campos(){
        this.x = 0;
    }
    public Campos(int x){
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void incrementar_x(){
        this.x++;
    }

    @Override
    public String toString() {
        return "Campos{" + "x=" + x + '}';
    }

}
