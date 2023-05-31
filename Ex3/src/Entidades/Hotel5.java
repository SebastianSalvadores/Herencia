/*
Hotel ***** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
Nombre del Restaurante, Capacidad del Restaurante, Cantidad Salones de
Conferencia, Cantidad de Suites, Cantidad de Limosinas, Precio de las Habitaciones.
 */
package Entidades;

/**
 *
 * @author Sebastian
 */
public class Hotel5 extends Hotel4{
    private Integer cantSalonConf;
    private Integer cantSuites;
    private Integer cantLimo;

    public Hotel5() {
    }

    public Hotel5(Integer cantSalonConf, Integer cantSuites, Integer cantLimo, Character gimnasio, String nombreRestaurante, Integer capacidadRestaurante, Integer cantHabitaciones, Integer numCamas, Integer cantPisos, String nombre, String direccion, String localidad, String gerente) {
        super(gimnasio, nombreRestaurante, capacidadRestaurante, cantHabitaciones, numCamas, cantPisos, nombre, direccion, localidad, gerente);
        this.cantSalonConf = cantSalonConf;
        this.cantSuites = cantSuites;
        this.cantLimo = cantLimo;
    }

    public Integer getCantSalonConf() {
        return cantSalonConf;
    }

    public void setCantSalonConf(Integer cantSalonConf) {
        this.cantSalonConf = cantSalonConf;
    }

    public Integer getCantSuites() {
        return cantSuites;
    }

    public void setCantSuites(Integer cantSuites) {
        this.cantSuites = cantSuites;
    }

    public Integer getCantLimo() {
        return cantLimo;
    }

    public void setCantLimo(Integer cantLimo) {
        this.cantLimo = cantLimo;
    }

    @Override
    public String toString() {
        calcularPrecio();
        return "Hotel5{" + "nombre=" + nombre + ", direccion=" + direccion + ", localidad=" + localidad + ", gerente=" + gerente + ", cantHabitaciones=" + cantHabitaciones + ", numCamas=" + numCamas + ", cantPisos=" + cantPisos + ", precioHabitaciones=" + precioHabitaciones + ", gimnasio=" + gimnasio + ", nombreRestaurante=" + nombreRestaurante + ", capacidadRestaurante=" + capacidadRestaurante + ", cantSalonConf=" + cantSalonConf + ", cantSuites=" + cantSuites + ", cantLimo=" + cantLimo + '}';
    }

    @Override
    public Double calcularPrecio() {
        Double precio = super.calcularPrecio();
        precio += (cantLimo * 15);
        return precio;
    }
    
}
