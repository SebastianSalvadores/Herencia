/*
Se debe crear también una subclase llamada Televisor con los siguientes atributos:
resolución (en pulgadas) y sintonizador TDT (booleano), además de los atributos
heredados.
Los constructores que se implementarán serán:
• Un constructor vacío.
• Un constructor con la resolución, sintonizador TDT y el resto de los atributos
heredados. Recuerda que debes llamar al constructor de la clase padre.

Los métodos que se implementara serán:
• Método get y set de los atributos resolución y sintonizador TDT.
• Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
los atributos del televisor.
• Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará
$500. Recuerda que las condiciones que hemos visto en la clase Electrodomestico
también deben afectar al precio.
 */
package Servicios;

import Entidades.Televisor;
import java.util.Scanner;

/**
 *
 * @author Sebastian
 */
public class TelevisorServicio extends ElectrodomesticoServicio{
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Televisor crearTelevisor(){
        System.out.println("Creando un Televisor: ");
        Televisor televisor = new Televisor();
        super.crearElectrodomestico(televisor);
        System.out.println("Ingrese la resolución en pulgadas del televisor:");
        double resolucion = leer.nextDouble();
        televisor.setResolucion(resolucion);
        String resp = "";
        boolean tdt;
        System.out.println("¿El televisor trae incorporado un sintonizador TDT? (S/N)");
        do {            
            resp = leer.next();
            if(!resp.equalsIgnoreCase("S") && !resp.equalsIgnoreCase("N")){
                System.out.println("Respuesta incorrecta. Por favor responda con S o N:");
            }
        } while (!resp.equalsIgnoreCase("S") && !resp.equalsIgnoreCase("N"));
        if(resp.equalsIgnoreCase("S")){
            tdt = true;
        }else{
            tdt = false;
        }
        televisor.setSintonizadorTDT(tdt);
        return televisor;
    }
    
    public void precioFinal(Televisor televisor){
        super.precioFinal(televisor);
        Double precio = televisor.getPrecio();
        Double resolucion = televisor.getResolucion();
        boolean tdt = televisor.isSintonizadorTDT();
        if(resolucion > 40){
            precio += precio * 0.30;
        }
        
        if(tdt){
            precio += 500;
        }
        
        televisor.setPrecio(precio);
    }
}
