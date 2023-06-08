package agregacion;

public class Universidad {
    private String nombre;
    private Estudiante[] estudiantes;
    private int cantidadEstudiantes;
    private static final int MAX_ESTUDIANTES = 100;

    public Universidad(String nombre) {
        this.nombre = nombre;
        this.estudiantes = new Estudiante[MAX_ESTUDIANTES];
        this.cantidadEstudiantes = 0;
    }

    public void agregarEstudiante(Estudiante estudiante){
        if (this.cantidadEstudiantes < Universidad.MAX_ESTUDIANTES){
            this.estudiantes[this.cantidadEstudiantes++] = estudiante;
        }else{
            System.out.println("Array lleno");
        }
    }


    public void mostrarEstudiantes(){
        System.out.println("Estudiantes: ");
        for (int i = 0; i < getCantidadEstudiantes(); i++){
            Estudiante estudiante = getEstudiantes()[i];
            System.out.println("Estudiante "+(i+1)+": ");
            System.out.println("Nombre: "+estudiante.getNombre());
            System.out.println("Edad: "+estudiante.getEdad());
            System.out.println("Numero de Estudiante: "+estudiante.getNumEstudiante());
        }
    }


    public Estudiante[] getEstudiantes() {
        return estudiantes;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidadEstudiantes() {
        return cantidadEstudiantes;
    }
}
