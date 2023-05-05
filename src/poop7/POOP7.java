/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop7;

import animales.Animal;
import animales.AnimalAcuatico;
import animales.AnimalAereo;
import animales.Ballena;
import animales.AnimalTerrestre;
import animales.Perro;
import animales.Pajaro;

/**
 * Clase principal que asigna e imprime datos de las clases Empleado, Gerente,
 * Animal, AnimalAcuatico, Ballena, AnimalTerrestre, Perro, AnimalAereo y la clase Pajaro
 * @author poo08alu04 alonso
 */
public class POOP7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**
         * se crea la variable empleado de tipo Empleado y se le asignan valores
         */
        Empleado empleado = new Empleado("Roberto", 112233, 25_000);
        //Se imprime la variable empleado
        System.out.println(empleado);
        /**
         * se crea la variable gerente de tipo gerente y se le asignan valores
         */
        Gerente gerente = new Gerente("Ramòn", 112231, 50_000, 0);
        //Se imprime la variable gerente
        System.out.println(gerente);
        //Se obtiene solo el nombre 
        System.out.println(gerente.getNombre());
        
        System.out.println("########### IS - A (es un)############");
        /**
         * Se comprueba que gerente es intancia de Gerente, Empleado y de Object
         */
        if(gerente instanceof Gerente){
            System.out.println("N1 - gerentes es una Instancia de Gerente");
        }
        if(gerente instanceof Empleado){
            System.out.println("N2 gerente es una Instancia de Empleado");
        }
        if(gerente instanceof Object){
            System.out.println("N3 gerente es una Instancia de Object");
        }
       
        System.out.println("########### ANIMALES ############");
        /**
         * Se crea la variable animal de tipo Animal y se le asignan valores
         */
        Animal animal = new Animal("Juan","Selva", "Azul");
        //se imprime la variable animal
        System.out.println(animal);
        /**
         * Se crea la variable animalacuatico de tipo AnimalAcuatico y se le asignan valores 
         */
        AnimalAcuatico animalacuatico = new AnimalAcuatico("Nemo", "Ocenano", "Acuàtico", 2);   
        //se imprime la variable animalacuatico
        System.out.println(animalacuatico);
        /**
         * Se crea la variable ballena de tipo Ballena y se le asignan valores 
         */
        Ballena ballena = new Ballena("Blue","Antartida", "Gris", 4, 30);
        System.out.println(ballena);
        /**
         * Se crea la variable animalterrestre de tipo AnimalTerrestre y se le asignan valores 
         */
        AnimalTerrestre animalterrestre = new AnimalTerrestre("perro", "México", "Café", 4);
        System.out.println(animalterrestre);
        /**
         * Se crea la variable perro de tipo Perro y se le asignan valores 
         */
        Perro perro = new Perro("Firulais", "México", "Café", 4, "Rojo");
        System.out.println(perro);
        /**
         * Se crea la variable animalaereo de tipo AnimalAereo y se le asignan valores 
         */
        AnimalAereo animalaereo = new AnimalAereo("Pelicano", "Playa", "Blanco", 2);
        System.out.println(animalaereo);
        /**
         * Se crea la variable pajaro de tipo Pajaro y se le asignan valores 
         */
        Pajaro pajaro = new Pajaro("Pajaro Carpintero", "Bosque", "azul, blanco y rojo",2, "delgado");
        System.out.println(pajaro);
        
    }
    
    
}
