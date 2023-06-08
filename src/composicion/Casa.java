package composicion;

import java.util.Arrays;

public class Casa {
    private Habitacion [] habitaciones;
    private int cantidadHabitaciones;
    public static final int CAPACIDAD_MAXIMA = 100;

    public Casa(){
        this.habitaciones = new Habitacion[CAPACIDAD_MAXIMA];
        this.cantidadHabitaciones = 0;
    }

    public void agregarHabitacion(Habitacion habitacion){
        if (cantidadHabitaciones < Casa.CAPACIDAD_MAXIMA){
            this.habitaciones[cantidadHabitaciones++] = habitacion;
        }else{
            System.out.println("Limite de habitaciones superado");
        }
    }

    public void destruirCasa(){
        System.out.println("Las casas han sido destruidas");
        this.habitaciones = new Habitacion[CAPACIDAD_MAXIMA];
        this.cantidadHabitaciones = 0;
    }

    public void mostrarInformacionCasa(){
        for (int i = 0; i < getCantidadHabitaciones();i++){
            Habitacion habitacion = getHabitaciones()[i];
            System.out.println("Habitacion "+(i+1)+": ");
            System.out.println("Numero habitacion: "+habitacion.getNumeroHabitacion());
            System.out.println("Tamaño habitacion: "+habitacion.getTamanioHabitacion());
        }
    }

    public Habitacion[] getHabitaciones() {
        return habitaciones;
    }

    public int getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }

    public void setHabitaciones(Habitacion[] habitaciones) {
        this.habitaciones = habitaciones;
    }

    public void setCantidadHabitaciones(int cantidadHabitaciones) {
        this.cantidadHabitaciones = cantidadHabitaciones;
    }

}
