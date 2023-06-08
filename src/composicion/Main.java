package composicion;

public class Main {
    public static void main(String[] args) {
        //instancia una casa de clase Casa
        Casa casa = new Casa();

        //crea 2 instancias de clase Habitacion
        Habitacion habitacion1 = new Habitacion(502,30.5);
        Habitacion habitacion2 = new Habitacion(401,20.5);

        //agregalas a la casa con el metodo agregarhabitacion
        casa.agregarHabitacion(habitacion1);
        casa.agregarHabitacion(habitacion2);

        //llama mostrar info
        casa.mostrarInformacionCasa();

        //llama destruir casa
        casa.destruirCasa();

        //llamar nuevamente mostrarinfo
        casa.mostrarInformacionCasa();

        //ya no me muestra las casas con la nueva llamada del metodo,
        //es decir que ya quedaron eliminadas del arreglo


    }
}
