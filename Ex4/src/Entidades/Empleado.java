/*
Sistema Gestión Facultad. Se pretende realizar una aplicación para una facultad que gestione
la información sobre las personas vinculadas con la misma y que se pueden clasificar en tres
tipos: estudiantes, profesores y personal de servicio. A continuación, se detalla qué tipo de
información debe gestionar esta aplicación:

    • Por cada persona, se debe conocer, al menos, su nombre y apellidos, su número de
    identificación y su estado civil.
    • Con respecto a los empleados, sean del tipo que sean, hay que saber su año de
    incorporación a la facultad y qué número de despacho tienen asignado.
    • En cuanto a los estudiantes, se requiere almacenar el curso en el que están
    matriculados.
    • Por lo que se refiere a los profesores, es necesario gestionar a qué departamento
    pertenecen (lenguajes, matemáticas, arquitectura, ...).
    • Sobre el personal de servicio, hay que conocer a qué sección están asignados
    (biblioteca, decanato, secretaría, ...).

El ejercicio consiste, en primer lugar, en definir la jerarquía de clases de esta aplicación. A
continuación, debe programar las clases definidas en las que, además de los constructores,
hay que desarrollar los métodos correspondientes a las siguientes operaciones:

    • Cambio del estado civil de una persona.
    • Reasignación de despacho a un empleado.
    • Matriculación de un estudiante en un nuevo curso.
    • Cambio de departamento de un profesor.
    • Traslado de sección de un empleado del personal de servicio.
    • Imprimir toda la información de cada tipo de individuo. Incluya un programa de prueba
    que instancie objetos de los distintos tipos y pruebe los métodos desarrollados.
 */
package Entidades;

/**
 *
 * @author Sebastian
 */
public abstract class Empleado extends Persona{
    protected Integer anhoIncorporacion;
    protected Integer nroDespacho;

    public Empleado() {
    }

    public Empleado(Integer anhoIncorporacion, Integer nroDespacho, String nombre, String apellido, String dni, String estadoCivil) {
        super(nombre, apellido, dni, estadoCivil);
        this.anhoIncorporacion = anhoIncorporacion;
        this.nroDespacho = nroDespacho;
    }

    public Integer getAnhoIncorporacion() {
        return anhoIncorporacion;
    }

    public void setAnhoIncorporacion(Integer anhoIncorporacion) {
        this.anhoIncorporacion = anhoIncorporacion;
    }

    public Integer getNroDespacho() {
        return nroDespacho;
    }

    public void setNroDespacho(Integer nroDespacho) {
        this.nroDespacho = nroDespacho;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", estadoCivil=" + estadoCivil + ", anhoIncorporacion=" + anhoIncorporacion + ", nroDespacho=" + nroDespacho + '}';
    }
    
}
