package com.mycompany.ejercicio1_2;

class Dinero {
    private int tipo;
    private int cantidad;

    public Dinero(int tipo, int cantidad) {
        this.tipo = tipo;
        this.cantidad = cantidad;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        if (tipo == 0) {
            return "Billetes de " + cantidad;
        } else {
            return "Monedas de " + cantidad;
        }
    }
    
    int Valor(){
        return cantidad;
    }
}
