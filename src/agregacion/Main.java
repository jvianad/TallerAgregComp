package agregacion;

public class Main {
    public static void main(String[] args) {

        Estudiante e1 = new Estudiante("Jean",25,123);
        Estudiante e2 = new Estudiante("Jose",35,456);

        Universidad universidad = new Universidad("Universidad XYZ");

        universidad.agregarEstudiante(e1);
        universidad.agregarEstudiante(e2);

        System.out.println(universidad.getNombre());

        universidad.mostrarEstudiantes();

    }
}
