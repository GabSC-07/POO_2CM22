package com.mycompany.ejercicio1_3;

class SeparaDigitos {
    private int n;

    public SeparaDigitos(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    int[] obtenerDigitos() {
        int m = n; 
        int contador = 0;

        while(m > 0) {
            contador++;
            m /= 10;
        }

        int[] digitos = new int[contador];
        m = n;

        for(int i = contador - 1; i >= 0; i--) {
            digitos[i] = m % 10;
            m /= 10;
        }      
        return digitos;
    }
    
    int cantidadCifras(int[] d){ return d.length; }
    
    int sumaImpares(int[] d){
        int suma = 0;
        
        for(int x : d){ if (x % 2 == 0) { suma += x; } }
        return suma;
    }
    
    int sumaPares(int[] d){
        int suma = 0;
        
        for(int x : d){ if (x % 2 != 0) { suma += x; } }
        return suma;
    }
    
    int sumaTotal(int[] d){
        int suma = 0;
        
        for(int x : d){ suma += x; }
        return suma;
    }
    
    int cifraMayor(int[] d){
        int mayor = 0;
        
        for(int x : d){ if (x >= mayor) { mayor = x; } }
        return mayor;
    }
    
    int cifraMenor(int[] d){
        int menor = 9;
        
        for(int x : d){ if (x <= menor) { menor = x; } }
        return menor;
    }

    @Override
    public String toString() {
        String divisores = "";
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) { divisores += i + "\n"; }
        }
        return divisores;
    }
}