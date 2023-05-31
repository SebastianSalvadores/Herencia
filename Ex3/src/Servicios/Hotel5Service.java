/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Hotel4;
import Entidades.Hotel5;

/**
 *
 * @author Sebastian
 */
public class Hotel5Service extends Hotel4Service{

    public void cargarAtributos(Hotel5 hotel) {
        super.cargarAtributos(hotel);
        System.out.println("Ingrese cantidad de Salones de Conferencia:");
        int salones = leer.nextInt();
        hotel.setCantSalonConf(salones);
        System.out.println("Ingrese cantidad de Suites:");
        int suites = leer.nextInt();
        hotel.setCantSuites(suites);
        System.out.println("Ingrese cantidad de limosinas:");
        int limos = leer.nextInt();
        hotel.setCantLimo(limos);
        
    }
    
}
