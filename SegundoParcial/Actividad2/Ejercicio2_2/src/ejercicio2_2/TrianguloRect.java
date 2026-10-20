package ejercicio2_2;

class TrianguloRect extends FiguraRecta {
    
    public TrianguloRect(int alto, int ancho) {
        this.alto = alto;
        this.ancho = ancho;
    }

    @Override
    public double calcularArea() {
        return (this.alto * this.ancho) / 2.0;
    }

    @Override
    public double calcularPerimetro() {
        double hipotenusa = Math.sqrt(Math.pow(this.alto, 2) + Math.pow(this.ancho, 2));
        return this.alto + this.ancho + hipotenusa;
    }

    @Override
    public String imprimeFigura() {
        return String.format(java.util.Locale.US, 
            "Se imprime un Triangulo con alto: %d, ancho: %d, area: %.2f, perimetro: %.2f \n",
            this.alto, this.ancho, calcularArea(), calcularPerimetro());
    }
}