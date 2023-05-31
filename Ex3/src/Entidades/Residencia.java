/*
Para las residencias se
indica la cantidad de habitaciones, si se hacen o no descuentos a los gremios y si posee o no
campo deportivo.
 */
package Entidades;

/**
 *
 * @author Sebastian
 */
public class Residencia extends AlExtrahotelero{
    private Integer cantHabitaciones;
    private boolean descuentoGremios;
    private boolean campoDeportivo;

    public Residencia() {
    }

    public Residencia(Integer cantHabitaciones, boolean descuentoGremios, boolean campoDeportivo, boolean privado, Double metrosCuadrados, String nombre, String direccion, String localidad, String gerente) {
        super(privado, metrosCuadrados, nombre, direccion, localidad, gerente);
        this.cantHabitaciones = cantHabitaciones;
        this.descuentoGremios = descuentoGremios;
        this.campoDeportivo = campoDeportivo;
    }

    public Integer getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void setCantHabitaciones(Integer cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public boolean isDescuentoGremios() {
        return descuentoGremios;
    }

    public void setDescuentoGremios(boolean descuentoGremios) {
        this.descuentoGremios = descuentoGremios;
    }

    public boolean isCampoDeportivo() {
        return campoDeportivo;
    }

    public void setCampoDeportivo(boolean campoDeportivo) {
        this.campoDeportivo = campoDeportivo;
    }

    @Override
    public String toString() {
        return "Residencia{" + "nombre=" + nombre + ", direccion=" + direccion + ", localidad=" + localidad + ", gerente=" + gerente + ", privado=" + privado + ", metrosCuadrados=" + metrosCuadrados + ", cantHabitaciones=" + cantHabitaciones + ", descuentoGremios=" + descuentoGremios + ", campoDeportivo=" + campoDeportivo + '}';
    }
    
    
}
