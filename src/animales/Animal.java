/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animales;

/**
 * Clase padre de Animal Acuático, Animal Aereo y Animal Terrestre
 * @author poo08alu04
 */
public class Animal {
    private String nombre;
    private String lugarOrigen;
    private String color;
    /**
     * constructor vacio
     */
    public Animal() {
    }
    /**
     * constructor que asigna los valores a los atributos de la clase Animal
     * @param nombre de tipo String
     * @param lugarOrigen de tipo String
     * @param color de tipo String
     */
    public Animal(String nombre, String lugarOrigen, String color) {
        this.nombre = nombre;
        this.lugarOrigen = lugarOrigen;
        this.color = color;
    }
    /**
     * getters and setters
     */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLugarOrigen() {
        return lugarOrigen;
    }

    public void setLugarOrigen(String lugarOrigen) {
        this.lugarOrigen = lugarOrigen;
    }

    public String getColor() {
        return color;
    }
   
    public void setColor(String color) {
        this.color = color;
    }
    /**
     * método que imprime el sonido que le asignes
     * @param sonido de tipo String 
     */
    public void sonido(String sonido){
        System.out.println(sonido);
    }
    /**
     * Método comer que imprime que el animal esta comiendo y defiende su comida
     */
    public void comer(){
        System.out.println("estoy comiento grrrrrr...");
    }
    /**
     * Método de sobreescritura que regresa la información de la clase Animal
     * @return param nombre
     * @return param lugarOrigen
     * @return param color
     */
    @Override
    public String toString() {
        return "Animal{" + "nombre=" + nombre + ", lugarOrigen=" + lugarOrigen + ", color=" + color + '}';
    }
    
}
