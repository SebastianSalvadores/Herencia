/*
Se plantea desarrollar un programa que nos permita calcular el área y el perímetro de formas
geométricas, en este caso un círculo y un rectángulo. Ya que este cálculo se va a repetir en las
dos formas geométricas, vamos a crear una Interfaz, llamada calculosFormas que tendrá, los
dos métodos para calcular el área, el perímetro y el valor de PI como constante.
Desarrollar el ejercicio para que las formas implementen los métodos de la interfaz y se
calcule el área y el perímetro de los dos. En el main se crearán las formas y se mostrará el
resultado final.

Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2.
 */
package ej4;

import Entidades.Circulo;
import Entidades.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author Sebastian
 */
public class Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el radio de un circulo:");
        double radio = leer.nextDouble();
        System.out.println("Ingrese el diametro del circulo:");
        double diametro = leer.nextDouble();
        Circulo circulo = new Circulo(radio, diametro);
        double area = circulo.calcularArea();
        double perimetro = circulo.calcularPerimetro();
        System.out.println("El area del circulo es: " + area + " y su perimetro es: " + perimetro);
        System.out.println("");
        System.out.println("Ingrese la base de un rectangulo: ");
        int base = leer.nextInt();
        System.out.println("Ingrese la altura del rectangulo: ");
        int altura = leer.nextInt();
        Rectangulo rectangulo = new Rectangulo(base, altura);
        area = rectangulo.calcularArea();
        perimetro = rectangulo.calcularPerimetro();
        System.out.println("El area del rectangulo es: " + area + " y su perimetro es: " + perimetro);
    }
    
}
