package com.mycompany.ejercicio1_5;

class Gastos {
    private String nombre;
    private int cantidad;

    public Gastos(String nombre, int cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    @Override
    public String toString() {
        return "Gastos{" + "nombre=" + nombre + ", cantidad=" + cantidad + '}';
    }  
}
