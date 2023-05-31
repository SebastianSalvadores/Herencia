/*
Los Hoteles tienen como atributos: Cantidad de Habitaciones, Número de Camas, Cantidad de
Pisos, Precio de Habitaciones. Y estos pueden ser de cuatro o cinco estrellas.
 */
package Entidades;

import java.util.Comparator;

/**
 *
 * @author Sebastian
 */
public abstract class Hotel extends Alojamiento{
    protected Integer cantHabitaciones;
    protected Integer numCamas;
    protected Integer cantPisos;
    protected Double precioHabitaciones;

    public Hotel() {
    }

    public Hotel(Integer cantHabitaciones, Integer numCamas, Integer cantPisos, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.cantHabitaciones = cantHabitaciones;
        this.numCamas = numCamas;
        this.cantPisos = cantPisos;
    }

    public Integer getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void setCantHabitaciones(Integer cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public Integer getNumCamas() {
        return numCamas;
    }

    public void setNumCamas(Integer numCamas) {
        this.numCamas = numCamas;
    }

    public Integer getCantPisos() {
        return cantPisos;
    }

    public void setCantPisos(Integer cantPisos) {
        this.cantPisos = cantPisos;
    }

    public Double getPrecioHabitaciones() {
        return precioHabitaciones;
    }

    public void setPrecioHabitaciones(Double precioHabitaciones) {
        this.precioHabitaciones = precioHabitaciones;
    }
    
    protected abstract Double calcularPrecio();

    @Override
    public String toString() {
        return "Hotel{" + "cantHabitaciones=" + cantHabitaciones + ", numCamas=" + numCamas + ", cantPisos=" + cantPisos + ", precioHabitaciones=" + precioHabitaciones + '}';
    }
    
     Comparator<Hotel> com = (Hotel h1, Hotel h2) -> h2.precioHabitaciones.compareTo(h1.precioHabitaciones);
}
