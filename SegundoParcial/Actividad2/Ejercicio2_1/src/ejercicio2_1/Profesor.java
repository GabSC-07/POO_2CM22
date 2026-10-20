package ejercicio2_1;

class Profesor extends Persona {
    private int numEmpleado;

    public Profesor(int numEmpleado) {
        super();
        this.numEmpleado = numEmpleado;
    }

    @Override
    public String toString() {
        return "Un profesor de edad " + this.edad + ", con clave " + this.numEmpleado;
    }
}