/*
Para los Camping se indica la capacidad máxima de carpas, la cantidad de baños
disponibles y si posee o no un restaurante dentro de las instalaciones.
 */
package Entidades;

/**
 *
 * @author Sebastian
 */
public class Camping extends AlExtrahotelero{
    private Integer maxCarpas;
    private Integer cantBanos;
    private boolean Restaurante;

    public Camping() {
    }

    public Camping(Integer maxCarpas, Integer cantBanos, boolean Restaurante, boolean privado, Double metrosCuadrados, String nombre, String direccion, String localidad, String gerente) {
        super(privado, metrosCuadrados, nombre, direccion, localidad, gerente);
        this.maxCarpas = maxCarpas;
        this.cantBanos = cantBanos;
        this.Restaurante = Restaurante;
    }

    public Integer getMaxCarpas() {
        return maxCarpas;
    }

    public void setMaxCarpas(Integer maxCarpas) {
        this.maxCarpas = maxCarpas;
    }

    public Integer getCantBanos() {
        return cantBanos;
    }

    public void setCantBanos(Integer cantBanos) {
        this.cantBanos = cantBanos;
    }

    public boolean isRestaurante() {
        return Restaurante;
    }

    public void setRestaurante(boolean Restaurante) {
        this.Restaurante = Restaurante;
    }

    @Override
    public String toString() {
        return "Camping{" + "nombre=" + nombre + ", direccion=" + direccion + ", localidad=" + localidad + ", gerente=" + gerente + ", privado=" + privado + ", metrosCuadrados=" + metrosCuadrados + ", maxCarpas=" + maxCarpas + ", cantBanos=" + cantBanos + ", Restaurante=" + Restaurante + '}';
    }
    
    
}
