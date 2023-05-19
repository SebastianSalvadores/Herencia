/*
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
mensaje por pantalla informando de que se alimenta.
 */
package Entidades;

/**
 *
 * @author Sebastian
 */
public abstract class Animal { //Como Animal nunca se va a instanciar como objeto, y solo se usa como Padre(Herencia), puede ser una clase abstracta.
    protected String nombre;
    protected String alimento;
    protected int edad;
    protected String raza;

    public Animal() {
    }

    public Animal(String nombre, String alimento, int edad, String raza) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.edad = edad;
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    public final void Alimentarse(){ //Como las clases hijas no necesitan sobreescribir este metodo, puede ponerse como final.
        if(alimento.equalsIgnoreCase("Carnivoro")){
            System.out.println(nombre + " se alimenta de Carne");
        }else if(alimento.equalsIgnoreCase("Herbivoro")){
            System.out.println(nombre + " se alimenta de Plantas");
        }else{
            System.out.println(nombre + " se alimenta de " + alimento);
        }
    }
}
