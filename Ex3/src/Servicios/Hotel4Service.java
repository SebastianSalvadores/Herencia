/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Hotel4;

/**
 *
 * @author Sebastian
 */
public class Hotel4Service extends HotelService{

    public void cargarAtributos(Hotel4 hotel) {
        super.cargarAtributos(hotel);
        System.out.println("Ingrese tipo de gimnasio (A o B)");
        char gimnasio = leer.next().toUpperCase().charAt(0);
        hotel.setGimnasio(gimnasio);
        System.out.println("Ingrese nombre del Restaurante:");
        String nombre = leer.next();
        hotel.setNombreRestaurante(nombre);
        System.out.println("Ingrese capacidad del Restaurante:");
        int capacidad = leer.nextInt();
        hotel.setCapacidadRestaurante(capacidad);
        
    }
    
}
