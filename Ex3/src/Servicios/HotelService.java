/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Alojamiento;
import Entidades.Hotel;

/**
 *
 * @author Sebastian
 */
public class HotelService extends AlojamientoService{

    public void cargarAtributos(Hotel hotel) {
        super.cargarAtributos(hotel);
        System.out.println("Ingrese cantidad de Habitaciones:");
        int cantHabitaciones = leer.nextInt();
        hotel.setCantHabitaciones(cantHabitaciones);
        System.out.println("Ingrese cantidad de camas: ");
        int camas = leer.nextInt();
        hotel.setNumCamas(camas);
        System.out.println("Ingrese cantidad de pisos: ");
        int pisos = leer.nextInt();
        hotel.setCantPisos(pisos);
    }
    
}
