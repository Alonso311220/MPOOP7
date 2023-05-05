/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animales;

/**
 * Clase Perro que se hereda de la clase AnimalTerrestre
 * @author alons
 */
public class Perro extends AnimalTerrestre
{
    /**
     * atrubuto colorCollar de tipo String y privado
     */
    private String colorCollar;

    public Perro() {
    }
    /**
     * Constructor que asigna valores a los parametros de la clase super (AnimalTerrestre)
     * y al atributo colorCollar de la clase Perro
     * @param nombre de tipo String 
     * @param lugarOrigen de tipo String
     * @param color de tipo String
     * @param numPatas de tipo int
     * @param colorCollar de tipo String
     */
    public Perro(String nombre, String lugarOrigen, String color, int numPatas, String colorCollar) {
        super(nombre, lugarOrigen, color, numPatas);
        this.colorCollar = colorCollar;
    }
    /**
     * get and set del atributo ColorCollar
     */
    public String getColorCollar() {
        return colorCollar;
    }

    public void setColorCollar(String colorCollar) {
        this.colorCollar = colorCollar;
    }
    /**
     * Método que imprime que el Perro sabe hacer trucos
     */
    public void hacerTrucos(){
        System.out.println("puedo hacerme el muerto...");
    }
    /**
     * Método de sobreescritura que primero imprime los parámetros de la clase super(clase AnimalTerrestre)
     * y se concatena el atributo colorCollar de la clase Perro
     * @return paramétros de la clase super(clase AnimalTerrestre)
     * @return param numPatas de la clase Perro
     */
    @Override
    public String toString() {
        return super.toString() + "Perro{" + "colorCollar=" + colorCollar + '}';
    }
    
}
