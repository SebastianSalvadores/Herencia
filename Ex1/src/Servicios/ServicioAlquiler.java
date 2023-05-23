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
package Servicios;

import Entidades.Alquiler;
import Entidades.Barco;
import Entidades.BarcoMotor;
import Entidades.Velero;
import Entidades.YateLujo;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author Sebastian
 */
public class ServicioAlquiler {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Alquiler crearAlquiler() {
        System.out.println("Ingrese nombre del cliente:");
        String nombre = leer.next();
        System.out.println("Ingrese documento del cliente:");
        long documento = leer.nextLong();

        boolean bandera = false;
        String fecha1;
        String fecha2;
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        do {
            System.out.println("Ingrese fecha de alquiler (DD/MM/AAAA):");
            fecha1 = leer.next().replace(" ", "/").replace("-", "/");
            if (fecha1.length() == 10 && fecha1.substring(2, 3).equals("/") && fecha1.substring(5, 6).equals("/")) {
                bandera = true;
            } else {
                System.out.println("Formato incorrecto.");
            }
        } while (bandera == false);

        LocalDate fechaAlquiler = LocalDate.parse(fecha1, formato);
        bandera = false;

        do {
            System.out.println("Ingrese fecha de devolucion (DD/MM/AAAA):");
            fecha2 = leer.next().replace(" ", "/").replace("-", "/");
            if (fecha2.length() == 10 && fecha2.substring(2, 3).equals("/") && fecha2.substring(5, 6).equals("/")) {
                bandera = true;
            } else {
                System.out.println("Formato incorrecto.");
            }
        } while (bandera == false);

        LocalDate fechaDevolucion = LocalDate.parse(fecha2, formato);

        System.out.println("Ingrese posicion de amarre:");
        String posicion = leer.next();

        Barco tipoBarco = null;
        int opc;
        do {
            System.out.println("Ingrese el tipo de barco:"
                    + "\n1. Barco comun"
                    + "\n2. Barco a motor"
                    + "\n3. Velero"
                    + "\n4. Yate de lujo");
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    ServicioBarco sb = new ServicioBarco();
                    tipoBarco = sb.crearBarco();
                    break;
                case 2:
                    ServicioBarcoMotor sbm = new ServicioBarcoMotor();
                    tipoBarco = sbm.crearBarcoMotor();
                    break;
                case 3:
                    ServicioVelero sv = new ServicioVelero();
                    tipoBarco = sv.crearVelero();
                    break;
                case 4:
                    ServicioYateLujo syl = new ServicioYateLujo();
                    tipoBarco = syl.crearYateLujo();
                    break;
                default:
                    System.out.println("opcion ingresada incorrecta.");
            }
        } while (tipoBarco == null);
        return new Alquiler(nombre, documento, fechaAlquiler, fechaDevolucion, posicion, tipoBarco);
    }

    public double calcularAlquiler(Alquiler alq) {
        Barco barco = alq.getTipoBarco();
        long duracion = alq.getFechaDevolucion().toEpochDay() - alq.getFechaAlquiler().toEpochDay();
        System.out.println("Duracion del alquiler: " + duracion);
        double modulo = barco.getEslora() * 10;

        if (barco instanceof Velero) {
            Velero velero = (Velero) barco;
            modulo += velero.getNumMastiles();
        } else if (barco instanceof YateLujo) {
            YateLujo yateLujo = (YateLujo) barco;
            modulo += yateLujo.getPotencia() + yateLujo.getCantCamarotes();
        } else if (barco instanceof BarcoMotor) {
            BarcoMotor barcoMotor = (BarcoMotor) barco;
            modulo += barcoMotor.getPotencia();
        }
        
        return duracion * modulo;
    }
}