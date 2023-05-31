/*
Por cada
Alojamiento Extrahotelero se indica si es privado o no, así como la cantidad de metros
cuadrados que ocupa.
 */
package Entidades;

/**
 *
 * @author Sebastian
 */
public abstract class AlExtrahotelero extends Alojamiento{
    protected boolean privado;
    protected Double metrosCuadrados;

    public AlExtrahotelero() {
    }

    public AlExtrahotelero(boolean privado, Double metrosCuadrados, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.privado = privado;
        this.metrosCuadrados = metrosCuadrados;
    }

    public boolean isPrivado() {
        return privado;
    }

    public void setPrivado(boolean privado) {
        this.privado = privado;
    }

    public Double getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(Double metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    @Override
    public String toString() {
        return "AlExtrahotelero{" + "privado=" + privado + ", metrosCuadrados=" + metrosCuadrados + '}';
    }
    
    
}
