package composicion;

public class Habitacion {
    private int numeroHabitacion;
    private double tamanioHabitacion;

    public Habitacion(int numeroHabitacion, double tamanioHabitacion){
        this.numeroHabitacion = numeroHabitacion;
        this.tamanioHabitacion = tamanioHabitacion;
    }

    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public void setNumeroHabitacion(int numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public double getTamanioHabitacion() {
        return tamanioHabitacion;
    }

    public void setTamanioHabitacion(double tamanioHabitacion) {
        this.tamanioHabitacion = tamanioHabitacion;
    }

}
