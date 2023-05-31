/*
Crear una superclase llamada Edificio con los siguientes atributos: ancho, alto y largo. 

La clase edificio tendrá como métodos:
• Método calcularSuperficie(): calcula la superficie del edificio.
• Método calcularVolumen(): calcula el volumen del edifico.

Estos métodos serán abstractos y los implementarán las siguientes clases:
• Clase Polideportivo con su nombre y tipo de instalación que puede ser Techado o
Abierto, esta clase implementará los dos métodos abstractos y los atributos del padre.
• Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de personas
por oficina y número de pisos. Esta clase implementará los dos métodos abstractos y
los atributos del padre.

De esta clase nos interesa saber cuántas personas pueden trabajar en todo el edificio, el
usuario dirá cuántas personas entran en cada oficina, cuantas oficinas y el número de piso
(suponiendo que en cada piso hay una oficina). Crear el método cantPersonas(), que muestre
cuantas personas entrarían en un piso y cuantas en todo el edificio.

Por último, en el main vamos a crear un ArrayList de tipo Edificio. El ArrayList debe contener
dos polideportivos y dos edificios de oficinas. Luego, recorrer este array y ejecutar los
métodos calcularSuperficie y calcularVolumen en cada Edificio. Se deberá mostrar la
superficie y el volumen de cada edificio.
Además de esto, para la clase Polideportivo nos interesa saber cuántos polideportivos son
techados y cuantos abiertos. Y para la clase EdificioDeOficinas deberemos llamar al método
cantPersonas() y mostrar los resultados de cada edificio de oficinas.
 */
package ex2;

import Entidades.Edificio;
import Entidades.EdificioDeOficinas;
import Entidades.Polideportivo;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Sebastian
 */
public class Ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Edificio> edificios = new ArrayList<>();
        Polideportivo p1 = new Polideportivo("La Cantera", "Techado", 30d, 3d, 70d);
        edificios.add(p1);
        Polideportivo p2 = new Polideportivo("El Semillero", "Abierto", 45d, 5d, 80d);
        edificios.add(p2);
        EdificioDeOficinas e1 = new EdificioDeOficinas(50, 5, 6, 20d, 18d, 60d);
        edificios.add(e1);
        EdificioDeOficinas e2 = new EdificioDeOficinas(5, 3, 3, 25d, 9d, 25d);
        edificios.add(e2);
        
        int cantTechados = 0;
        int cantAbiertos = 0;
        int i = 0;
        for (Edificio edificio : edificios) {
            if (edificio instanceof Polideportivo) {
                Polideportivo polideportivo = (Polideportivo) edificio;
                System.out.println("La superficie del Polideportivo " + polideportivo.getNombre() + " es de " + polideportivo.calcularSuperficie() + "m2 y su volumen de " + polideportivo.calcularVolumen() + "m3.");
                if(polideportivo.getTipoInstalacion().equals("Techado")){
                    cantTechados++;
                }else if(polideportivo.getTipoInstalacion().equals("Abierto")){
                    cantAbiertos++;
                }
                continue;
            }
            if(edificio instanceof EdificioDeOficinas){
                i++;
                EdificioDeOficinas edificioDeOficinas = (EdificioDeOficinas) edificio;
                System.out.println("La superficie del Edificio de Oficinas " + i + " es de " + edificioDeOficinas.calcularSuperficie() + "m2 y su volumen de " + edificioDeOficinas.calcularVolumen() + "m3.");
                edificioDeOficinas.cantPersonas();
            }
        }
        System.out.println("Hay " + cantAbiertos + " polideportivos Abiertos y " + cantTechados + " polideportivos Techados.");
    }
}