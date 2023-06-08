package agregacion;

public class Estudiante {
    private String nombre;
    private int edad;
    private int numEstudiante;

    public Estudiante(String nombre, int edad, int numEstudiante) {
        this.nombre = nombre;
        this.edad = edad;
        this.numEstudiante = numEstudiante;
    }

    @Override
    public String toString() {
        return "{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", numEstudiante=" + numEstudiante +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getNumEstudiante() {
        return numEstudiante;
    }
}
