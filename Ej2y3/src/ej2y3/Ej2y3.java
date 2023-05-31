/*
Ej2. En el main debemos realizar lo siguiente:
Vamos a crear una Lavadora y un Televisor y llamar a los métodos necesarios para mostrar
el precio final de los dos electrodomésticos.

Ej3. Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de Electrodomésticos
para guardar 4 electrodomésticos, ya sean lavadoras o televisores, con valores ya asignados.
Luego, recorrer este array y ejecutar el método precioFinal() en cada electrodoméstico. Se
deberá también mostrar el precio de cada tipo de objeto, es decir, el precio de todos los
televisores y el de las lavadoras. Una vez hecho eso, también deberemos mostrar, la suma del
precio de todos los Electrodomésticos. Por ejemplo, si tenemos una lavadora con un precio de
2000 y un televisor de 5000, el resultado final será de 7000 (2000+5000) para
electrodomésticos, 2000 para lavadora y 5000 para televisor.
 */
package ej2y3;

import Entidades.Electrodomestico;
import Entidades.Lavadora;
import Entidades.Televisor;
import Servicios.LavadoraServicio;
import Servicios.TelevisorServicio;
import java.util.ArrayList;

/**
 *
 * @author Sebastian
 */
public class Ej2y3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Ejercicio 2
        LavadoraServicio ls = new LavadoraServicio();
        TelevisorServicio ts = new TelevisorServicio();
        
        Lavadora lavadora = ls.crearLavadora();
        ls.precioFinal(lavadora);
        Televisor televisor = ts.crearTelevisor();
        ts.precioFinal(televisor);
        
        System.out.println(lavadora.toString());
        System.out.println(televisor.toString());
        
        //Ejercicio 3
        System.out.println("\nEjercicio 3");
        
        ArrayList<Electrodomestico> electrodomesticos = new ArrayList<>();
        
        double precioLavadoras = 0;
        double precioTelevisores = 0;
        
        Lavadora lav1 = new Lavadora(20d, "azul", 'C', 25d); //2100
        electrodomesticos.add(lav1);
        Televisor tel1 = new Televisor(50d, true, "negro", 'A', 20d);  //3750
        electrodomesticos.add(tel1);
        Televisor tel2 = new Televisor(30d, false, "blanco", 'D', 40d); //2000
        electrodomesticos.add(tel2);
        Lavadora lav2 = new Lavadora(40d, "gris", 'F', 60d); //2400
        electrodomesticos.add(lav2);
        
        for (Electrodomestico aux : electrodomesticos) {
            if(aux instanceof Lavadora){
                ls.precioFinal((Lavadora)aux);
                System.out.println("El electrodomestico " + (electrodomesticos.indexOf(aux) + 1) + " es una Lavadora y su precio es: $" + aux.getPrecio());
                precioLavadoras += aux.getPrecio();
            }
            if(aux instanceof Televisor){
                ts.precioFinal((Televisor)aux);
                System.out.println("El electrodomestico " + (electrodomesticos.indexOf(aux) + 1) + " es un Televisor y su precio es: $" + aux.getPrecio());
                precioTelevisores += aux.getPrecio();
            }
        }
        
        System.out.println("El precio total de los Electrodomesticos es de $" + (precioLavadoras + precioTelevisores) + ", el precio total de las Lavadoras es $" + precioLavadoras + ", y el de los televisores $" + precioTelevisores + ".");
    }
    
}
