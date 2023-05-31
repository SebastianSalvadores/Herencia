/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Alojamiento;
import java.util.Scanner;

/**
 *
 * @author Sebastian
 */
public class AlojamientoService {
    protected Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public void cargarAtributos(Alojamiento aloj){
        System.out.println("Ingrese nombre del Alojamiento: ");
        String nombre = leer.next();
        aloj.setNombre(nombre);
        System.out.println("Ingrese direccion: ");
        String direccion = leer.next();
        aloj.setDireccion(direccion);
        System.out.println("Ingrese localidad: ");
        String localidad = leer.next();
        aloj.setLocalidad(localidad);
        System.out.println("Ingrese nombre del gerente: ");
        String gerente = leer.next();
        aloj.setGerente(gerente);
    }
}
