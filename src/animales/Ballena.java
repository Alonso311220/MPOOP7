/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animales;

/**
 * Clase Ballena que se hereda de la clase AnimalAcuatico
 * @author poo08alu04
 */
public class Ballena extends AnimalAcuatico{
    /**
     * atributo largo de la clase Ballena de tipo int y privado
     */
    private int largo;

    public Ballena() {
    }
    /**
     * Constructor que asigna valores a los parametros de la clase super (AnimalAcuatico)
     * y al atributo largo de la clase Ballena
     * @param nombre de tipo String
     * @param lugarOrigen de tipo String
     * @param color de tipo String
     * @param numAletas de tipo int
     * @param largo de tipo int
     */
    public Ballena(String nombre, String lugarOrigen, String color, int numAletas, int largo) {
        super(nombre, lugarOrigen, color, numAletas);
        this.largo = largo;
    }
    /**
     * get and set del atributo largo 
     */
    public int getLargo() {
        return largo;
    }
    
    public void setLargo(int largo) {
        this.largo = largo;
    }
    /**
     * Método que imprime que la ballena esta peleando con pinocho
     */
    public void pelearConPinocho(){
        System.out.println("Estoy peleando con Pinocho");
    }
    /**
     * Método de sobreescritura que primero imprime los parámetros de la clase super(clase AnimalAcuatico)
     * y se concatena el atributo largo de la clase Ballena
     * @return paramétros de la clase super(clase AnimalAcuatico)
     * @return param largo de la clase Ballena
     */
    @Override
    public String toString() {
        return super.toString() + "Ballena{" + "largo=" + largo + '}';
    }
    
}
