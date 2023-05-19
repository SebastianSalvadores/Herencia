/*
Vamos a crear una clase Animal que tenga un método hacerRuido() que devuelva un saludo
“Hola”. Luego haremos clase Perro y clase Gato que extiendan de Animal y sobreescriban el
método hacerRuido() con el ruido que corresponda a cada uno. Luego, en el main vamos a crear
un ArrayList de animales y los siguientes animales

Animal a = new Animal();
Animal b = new Perro();
Animal c = new Gato();

Agregaremos a la lista a cada uno y luego, con un for each, recorreremos la lista llamando al
método hacerRuido() de cada ítem.
 */
package ejanimal;

import Entidades.Animal;
import Entidades.Gato;
import Entidades.Perro;
import Entidades.interfazPrueba;
import java.util.ArrayList;

/**
 *
 * @author Sebastian
 */
public class EjAnimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Animal> animales = new ArrayList<>();
        
        Animal a = new Animal();
        animales.add(a);
        Animal b = new Perro();
        animales.add(b);
        Animal c = new Gato();
        animales.add(c);
        
        for (Animal animal : animales) {
            animal.hacerRuido();
        }
        
        interfazPrueba test = new interfazPrueba() {
            @Override
            public void mostrarMensaje() {
                System.out.println("Hola mundo " + CONSTANTE);
            }
        };
        //lambda
        //interfazPrueba test = () -> System.out.println("Hola mundo");
        
        test.mostrarMensaje();
    }
    
}
