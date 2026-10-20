package com.mycompany.ejercicio1_4;

class Multiplicar {
    private int n, i;

    public Multiplicar(int n, int i) {
        this.n = n;
        this.i = i;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    @Override
    public String toString() {
        return n + "x" + i + " = " + (n * i) + "\n";
    }
}
