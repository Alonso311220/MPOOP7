/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animales;

/**
 * Clase AnimalAereo que se hereda de la clase Animal
 * @author poo08alu04
 */
public class AnimalAereo extends Animal {
    /**
     * atributo numeroAlas de tipo int y privado
     */
    private int numeroAlas;
    
    /**
     * Constructor que asigna valores a los parametros de la clase super
     * y al atributo de la clase Animal Aereo
     * @param nombre de tipo String
     * @param lugarOrigen de tipo String
     * @param color de tipo String
     * @param numeroAlas de tipo String
     */
    public AnimalAereo(String nombre, String lugarOrigen, String color, int numeroAlas) {
        super(nombre, lugarOrigen, color);
        this.numeroAlas = numeroAlas;
    }
    /**
     * getters and setters 
     */
    public int getNumeroAlas() {
        return numeroAlas;
    }

    public void setNumeroAlas(int numeroAlas) {
        this.numeroAlas = numeroAlas;
    }
    /**
     * Método que imprime que el animal aereo está volando
     */
    public void volar(){
        System.out.println("puedoooo volar!");
    }
    /**
     * Método que imprime que el animal aereo está comiendo
     */
    public void comer(){
        System.out.println("que ricos pescados");
    }
    /**
     * Método de sobreescritura que primero imprime los parámetros de la clase super(clase Animal)
     * y se concatena el atributo numAlas de la clase AnimalAereo
     * @return paramétros de la clase super(clase Animal)
     * @return param numAletas
     */
    @Override
    public String toString() {
        return super.toString() + "AnimalAereo{" + "numeroAlas=" + numeroAlas + '}';
    }
    
}
