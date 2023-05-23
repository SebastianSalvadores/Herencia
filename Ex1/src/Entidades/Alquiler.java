/*
En un puerto se alquilan amarres para barcos de distinto tipo. Para cada Alquiler se guarda: el
nombre, documento del cliente, la fecha de alquiler, fecha de devolución, la posición del
amarre y el barco que lo ocupará.

Un Barco se caracteriza por: su matrícula, su eslora en metros y año de fabricación.
Sin embargo, se pretende diferenciar la información de algunos tipos de barcos especiales:
    • Número de mástiles para veleros.
    • Potencia en CV para barcos a motor.
    • Potencia en CV y número de camarotes para yates de lujo.

Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de
alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente
multiplicando por 10 los metros de eslora).

En los barcos de tipo especial el módulo de cada barco se calcula sacando el módulo normal y
sumándole el atributo particular de cada barco. En los veleros se suma el número de mástiles,
en los barcos a motor se le suma la potencia en CV y en los yates se suma la potencia en CV y
el número de camarotes.

Utilizando la herencia de forma apropiada, deberemos programar en Java, las clases y los
métodos necesarios que permitan al usuario elegir el barco que quiera alquilar y mostrarle el
precio final de su alquiler.
 */
package Entidades;

import java.time.LocalDate;

/**
 *
 * @author Sebastian
 */
public class Alquiler {
    private String nombre;
    private Long documento;
    private LocalDate fechaAlquiler;
    private LocalDate fechaDevolucion;
    private String posicionAmarre;
    private Barco tipoBarco;

    public Alquiler() {
    }

    public Alquiler(String nombre, Long documento, LocalDate fechaAlquiler, LocalDate fechaDevolucion, String posicionAmarre, Barco tipoBarco) {
        this.nombre = nombre;
        this.documento = documento;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.posicionAmarre = posicionAmarre;
        this.tipoBarco = tipoBarco;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getDocumento() {
        return documento;
    }

    public void setDocumento(Long documento) {
        this.documento = documento;
    }

    public LocalDate getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(LocalDate fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public String getPosicionAmarre() {
        return posicionAmarre;
    }

    public void setPosicionAmarre(String posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }

    public Barco getTipoBarco() {
        return tipoBarco;
    }

    public void setTipoBarco(Barco tipoBarco) {
        this.tipoBarco = tipoBarco;
    }

    @Override
    public String toString() {
        return "Alquiler{" + "nombre=" + nombre + ", documento=" + documento + ", fechaAlquiler=" + fechaAlquiler + ", fechaDevolucion=" + fechaDevolucion + ", posicionAmarre=" + posicionAmarre + ", tipoBarco=" + tipoBarco + '}';
    }
    
    
}
