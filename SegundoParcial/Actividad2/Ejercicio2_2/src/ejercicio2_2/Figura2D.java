package ejercicio2_2;

abstract class Figura2D implements FiguraPlana {
    public Figura2D() {
        System.out.println("Se imprime una FiguraPlana...\n");
    }

    protected abstract String imprimeFigura();
}