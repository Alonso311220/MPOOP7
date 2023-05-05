/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animales;

/**
 * Clase AnimalAcuatico que se hereda de la clase Animal 
 * @author poo08alu04 alonso 
 */
public class AnimalAcuatico extends Animal{
    /**
     * atributo de la clase AnimalAcuatico de tipo int y privado
     */
    private int numAletas;

    public AnimalAcuatico() {
    }
    /**
     * Constructor que asigna valores a los parametros de la clase super 
     * y al atributo de la clase Animal Acuatico
     * @param nombre de tipo String
     * @param lugarOrigen de tipo String
     * @param color de tipo String
     * @param numAletas de tipo int 
     */
    public AnimalAcuatico(String nombre, String lugarOrigen, String color, int numAletas) {
        super(nombre, lugarOrigen, color);
        this.numAletas = numAletas;
    }
    /**
     * getters and setters 
     */
    public int getNumAletas() {
        return numAletas;
    }

    public void setNumAletas(int numAletas) {
        this.numAletas = numAletas;
    }
    /**
     * Método que imprime que el animal acuático está nadando 
     */
    public void nadar(){
        System.out.println("Estoy nadanado yupi");
    }
    /**
     * Método que imprime que el animal acuatico está comiendo
     */
    public void comer(){
        System.out.println("Estoy comiento ñomi ñomi...");
    }
    /**
     * Método de sobreescritura donde primero se imprimen los parámetros de la clase super(clase Animal)
     * y se concatena el atributo numAletas de la clase AnimalAcuático
     * @return paramétros de la clase super(clase Animal)
     * @return param numAletas
     */
    @Override
    public String toString() {
        return super.toString() + "AnimalAcuatico{" + "numAletas=" + numAletas + '}';
    }
    
}
