/*
Crear una superclase llamada Electrodoméstico con los siguientes atributos: precio, color,
consumo energético (letras entre A y F) y peso.

Los constructores que se deben implementar son los siguientes:
• Un constructor vacío.
• Un constructor con todos los atributos pasados por parámetro.
Los métodos a implementar son:
• Métodos getters y setters de todos los atributos.
• Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
objeto y no será visible.
• Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
minúsculas. Este método se invocará al crear el objeto y no será visible.
• Metodo crearElectrodomestico(): le pide la información al usuario y llena el
electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
precio se le da un valor base de $1000.
• Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del
precio. Esta es la lista de precios: 

LETRA PRECIO
A $1000
B $800
C $600
D $500
E $300
F $100
PESO PRECIO
Entre 1 y 19 kg $100
Entre 20 y 49 kg $500
Entre 50 y 79 kg $800
Mayor que 80 kg $1000
 */
package Servicios;

import Entidades.Electrodomestico;
import java.util.Scanner;


/**
 *
 * @author Sebastian
 */
public class ElectrodomesticoServicio {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public void crearElectrodomestico(Electrodomestico e){
        
        System.out.println("Ingrese color del Electrodomestico:");
        String color = leer.next();
        e.comprobarColor(color);
        System.out.println("Ingrese consumo energetico:");
        String consumo = leer.next().toUpperCase();
        e.comprobarConsumoEnergetico(consumo);
        System.out.println("Ingrese peso:");
        Double peso = leer.nextDouble();
        e.setPeso(peso);
    }
    
    public void precioFinal(Electrodomestico e){
        Double precio = e.getPrecio();
        char consumo = e.getConsumoEnergetico();
        Double peso = e.getPeso();
        switch (consumo) {
            case 'A':
                precio += 1000;
                break;
            case 'B':
                precio += 800;
                break;
            case 'C':
                precio += 600;
                break;
            case 'D':
                precio += 500;
                break;
            case 'E':
                precio += 300;
                break;
            case 'F':
                precio += 100;
        }
        if(peso >= 1 && peso < 20){
            precio += 100;
        }else if(peso >= 20 && peso < 50){
            precio += 500;
        }else if(peso >= 50 && peso < 80){
            precio += 800;
        }else if(peso >= 80){
            precio += 1000;
        }
        e.setPrecio(precio);
    }
}
