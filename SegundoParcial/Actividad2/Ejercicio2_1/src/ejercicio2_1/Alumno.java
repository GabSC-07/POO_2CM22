package ejercicio2_1;

class Alumno extends Persona {
    public Alumno() {
        super();
        System.out.println("Se crea Alumno...");
    }

    @Override
    public String toString() {
        return "Un alumno llamado: " + this.nombre;
    }
}
