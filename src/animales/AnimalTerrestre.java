/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animales;

/**
 * Clase AnimalTerrestre que se hereda de la clase Animal
 * @author poo08alu04
 */
public class AnimalTerrestre extends Animal{
    /**
     * atributo numPatas de tipo int y privado
     */
    private int numPatas;

    public AnimalTerrestre() {
    }
    /**
     * Constructor que asigna valores a los parametros de la clase super
     * y al atributo de la clase Animal Terrestre
     * @param nombre de tipo String
     * @param lugarOrigen de tipo String
     * @param color de tipo String
     * @param numPatas de tipo int 
     */
    public AnimalTerrestre(String nombre, String lugarOrigen, String color, int numPatas) {
        super(nombre, lugarOrigen, color);
        this.numPatas = numPatas;
    }
    /**
     * getters and setters 
     */
    public int getNumPatas() {
        return numPatas;
    }

    public void setNumPatas(int numPatas) {
        this.numPatas = numPatas;
    }
    /**
     * Método que imprime que el animal está corriendo
     */
    public void correr(){
        System.out.println("Puedo correr!");
    }
    /**
     * Método que imprime que el animal está comiendo
     */
    public void comer(){
        System.out.println("Que rica comida");
    }
     /**
     * Método de sobreescritura que primero imprime los parámetros de la clase super(clase Animal)
     * y se concatena el atributo numPatas de la clase AnimalTerrestre
     * @return paramétros de la clase super(clase Animal)
     * @return param numPatas
     */
    @Override
    public String toString() {
        return super.toString() + "AnimalTerrestre{" + "numPatas=" + numPatas + '}';
    }
    
}
