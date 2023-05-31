/*
Hotel **** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
Nombre del Restaurante, Capacidad del Restaurante, Precio de las Habitaciones.
 */
package Entidades;

/**
 *
 * @author Sebastian
 */
public class Hotel4 extends Hotel{
    protected Character gimnasio;
    protected String nombreRestaurante;
    protected Integer capacidadRestaurante;

    public Hotel4() {
    }

    public Hotel4(Character gimnasio, String nombreRestaurante, Integer capacidadRestaurante, Integer cantHabitaciones, Integer numCamas, Integer cantPisos, String nombre, String direccion, String localidad, String gerente) {
        super(cantHabitaciones, numCamas, cantPisos, nombre, direccion, localidad, gerente);
        this.gimnasio = gimnasio;
        this.nombreRestaurante = nombreRestaurante;
        this.capacidadRestaurante = capacidadRestaurante;
    }

    
    public Character getGimnasio() {
        return gimnasio;
    }

    public void setGimnasio(Character gimnasio) {
        this.gimnasio = gimnasio;
    }

    public String getNombreRestaurante() {
        return nombreRestaurante;
    }

    public void setNombreRestaurante(String nombreRestaurante) {
        this.nombreRestaurante = nombreRestaurante;
    }

    public Integer getCapacidadRestaurante() {
        return capacidadRestaurante;
    }

    public void setCapacidadRestaurante(Integer capacidadRestaurante) {
        this.capacidadRestaurante = capacidadRestaurante;
    }

    @Override
    public String toString() {
        
        return "Hotel4{" + "nombre=" + nombre + ", direccion=" + direccion + ", localidad=" + localidad + ", gerente=" + gerente + ", cantHabitaciones=" + cantHabitaciones + ", numCamas=" + numCamas + ", cantPisos=" + cantPisos + ", precioHabitaciones=" + precioHabitaciones + ", gimnasio=" + gimnasio + ", nombreRestaurante=" + nombreRestaurante + ", capacidadRestaurante=" + capacidadRestaurante + '}';
    }

    @Override
    public Double calcularPrecio() {
        Double precio = 50D + (1 * cantHabitaciones);
        if(capacidadRestaurante < 30){
            precio += 10;
        }else if(capacidadRestaurante >= 30 && capacidadRestaurante < 50){
            precio += 30;
        }else if(capacidadRestaurante >= 50){
            precio += 50;
        }
        switch (gimnasio) {
            case 'A':
                precio += 50;
                break;
            case 'B':
                precio += 30;
                break;
        }
        return precio;
    }
    
    
}
