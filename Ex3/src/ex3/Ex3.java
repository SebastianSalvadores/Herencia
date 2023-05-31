/*
Una compañía de promociones turísticas desea mantener información sobre la infraestructura
de alojamiento para turistas, de forma tal que los clientes puedan planear sus vacaciones de
acuerdo con sus posibilidades. Los alojamientos se identifican por un nombre, una dirección,
una localidad y un gerente encargado del lugar. La compañía trabaja con dos tipos de
alojamientos: Hoteles y Alojamientos Extrahoteleros.
Los Hoteles tienen como atributos: Cantidad de Habitaciones, Número de Camas, Cantidad de
Pisos, Precio de Habitaciones. Y estos pueden ser de cuatro o cinco estrellas. Las
características de las distintas categorías son las siguientes:
• Hotel **** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
Nombre del Restaurante, Capacidad del Restaurante, Precio de las Habitaciones.
• Hotel ***** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
Nombre del Restaurante, Capacidad del Restaurante, Cantidad Salones de
Conferencia, Cantidad de Suites, Cantidad de Limosinas, Precio de las Habitaciones.
Los gimnasios pueden ser clasificados por la empresa como de tipo “A” o de tipo “B”, de
acuerdo a las prestaciones observadas. Las limosinas están disponibles para cualquier
cliente, pero sujeto a disponibilidad, por lo que cuanto más limosinas tenga el hotel, más caro
será.
El precio de una habitación debe calcularse de acuerdo con la siguiente fórmula:
PrecioHabitación = $50 + ($1 x capacidad del hotel) + (valor agregado por restaurante) + (valor
agregado por gimnasio) + (valor agregado por limosinas).
Donde:
Valor agregado por el restaurante:
• $10 si la capacidad del restaurante es de menos de 30 personas.
• $30 si está entre 30 y 50 personas.
• $50 si es mayor de 50.
Valor agregado por el gimnasio:
• $50 si el tipo del gimnasio es A.
• $30 si el tipo del gimnasio es B.
Valor agregado por las limosinas:
• $15 por la cantidad de limosinas del hotel.

En contraste, los Alojamientos Extra hoteleros proveen servicios diferentes a los de los
hoteles, estando más orientados a la vida al aire libre y al turista de bajos recursos. Por cada
Alojamiento Extrahotelero se indica si es privado o no, así como la cantidad de metros
cuadrados que ocupa. Existen dos tipos de alojamientos extrahoteleros: los Camping y las
Residencias. Para los Camping se indica la capacidad máxima de carpas, la cantidad de baños
disponibles y si posee o no un restaurante dentro de las instalaciones. Para las residencias se
indica la cantidad de habitaciones, si se hacen o no descuentos a los gremios y si posee o no
campo deportivo. Realizar un programa en el que se representen todas las relaciones
descriptas.
Realizar un sistema de consulta que le permite al usuario consultar por diferentes criterios:
• todos los alojamientos.
• todos los hoteles de más caro a más barato.
• todos los campings con restaurante
• todos las residencias que tienen descuento.
 */
package ex3;

import Entidades.Alojamiento;
import Entidades.Camping;
import Entidades.Hotel;
import Entidades.Hotel4;
import Entidades.Hotel5;
import Entidades.Residencia;
import Servicios.Hotel5Service;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Sebastian
 */
public class Ex3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Alojamiento> alojamientos = new ArrayList();
        Hotel4 h1 = new Hotel4('B', "BuenComer", 40, 20, 60, 4, "Hotel Pepito", "Av San Martin 1000", "Buenos Aires", "Juan de los Palotes");
        Double precio = h1.calcularPrecio();
        h1.setPrecioHabitaciones(precio);
        alojamientos.add(h1);
        
        
        Hotel5 h2 = new Hotel5(1, 10, 5, 'A', "Le Magique Food", 100, 60, 300, 10, "Hotel Gran Hotel", "Av Libertador 400", "Cordoba", "Fulano Mengano");
        precio = h2.calcularPrecio();
        h2.setPrecioHabitaciones(precio);
        alojamientos.add(h2);
        
        Camping camp1 = new Camping(10, 3, true, false, 2900D, "Campamento Oak", "RP 6 km 80", "Provincia Buenos Aires", "Maximo Cosetti");
        alojamientos.add(camp1);
        Camping camp2 = new Camping(30, 2, false, true, 2500D, "Camping El Delfin", "Calle Rocamonte", "Neuquen", "Carlos Diaz");
        alojamientos.add(camp2);
        
        Residencia res1 = new Residencia(3, true, false, false, 900D, "BIOHAZARD", "Loma del otro 123", "Tierra del Fuego", "Vicente Planes");
        alojamientos.add(res1);
        
        Residencia res2 = new Residencia(15, false, true, true, 4000D, "House Stark", "North Street 100", "Scotland", "Eddard Stark");
        alojamientos.add(res2);
        
//        Hotel5Service h5s = new Hotel5Service();
//        Hotel5 h3 = new Hotel5();
//        h5s.cargarAtributos(h3);
//        precio = h3.calcularPrecio();
//        h3.setPrecioHabitaciones(precio);
//        alojamientos.add(h3);
        int opc = 0;
        do {            
            System.out.println("Sistema de consultas de Alojamientos"
                    + "\n 1. Mostrar todos los alojamientos"
                    + "\n 2. Mostrar hoteles del mas caro al mas barato"
                    + "\n 3. Mostrar campings con restaurante"
                    + "\n 4. Mostrar residencias con descuento"
                    + "\n 5. Salir");
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    opcion1(alojamientos);
                    break;
                case 2:
                    opcion2(alojamientos);
                    break;
                case 3:
                    opcion3(alojamientos);
                    break;
                case 4:
                    opcion4(alojamientos);
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Opcion incorrecta.");
            }
        } while (opc != 5);
        
        
    }
    
    public static void opcion1(ArrayList<Alojamiento> alojamientos){
        for (Alojamiento alojamiento : alojamientos) {
            if(alojamiento instanceof Hotel5){
                System.out.println(((Hotel5) alojamiento).toString());
            }else if(alojamiento instanceof Hotel4){
                System.out.println(((Hotel4) alojamiento).toString());
            }else if(alojamiento instanceof Camping){
                System.out.println(((Camping) alojamiento).toString());
            }else if(alojamiento instanceof Residencia){
                System.out.println(((Residencia) alojamiento).toString());
            }
        }
    }
    
    public static void opcion2(ArrayList<Alojamiento> alojamientos){
        Comparator<Hotel> com = (Hotel h1, Hotel h2) -> h2.getPrecioHabitaciones().compareTo(h1.getPrecioHabitaciones());
        ArrayList<Hotel> hoteles = new ArrayList();
        
        for (Alojamiento alojamiento : alojamientos) {
            if(alojamiento instanceof Hotel){
                hoteles.add((Hotel) alojamiento);
            }
        }
        
        hoteles.sort(com);
        
        for (Hotel hotel : hoteles) {
            if(hotel instanceof Hotel5){
                System.out.println(((Hotel5) hotel).toString());
            }else if(hotel instanceof Hotel4){
                System.out.println(((Hotel4) hotel).toString());
            }
        }
    }
    
    public static void opcion3(ArrayList<Alojamiento> alojamientos){
        ArrayList<Camping> campings = new ArrayList();
        
        for (Alojamiento alojamiento : alojamientos) {
            if(alojamiento instanceof Camping){
                if(((Camping) alojamiento).isRestaurante()){
                    campings.add((Camping) alojamiento);
                }
            }
        }
        
        for (Camping camping : campings) {
            System.out.println(camping.toString());
        }
    }
    
    public static void opcion4(ArrayList<Alojamiento> alojamientos){
        ArrayList<Residencia> residencias = new ArrayList();
        
        for (Alojamiento alojamiento : alojamientos) {
            if(alojamiento instanceof Residencia){
                if(((Residencia) alojamiento).isDescuentoGremios()){
                    residencias.add((Residencia) alojamiento);
                }
            }
        }
        
        for (Residencia residencia : residencias) {
            System.out.println(residencia.toString());
        }
    }
}
