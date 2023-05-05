/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animales;

/**
 * Clase Pajaro que se hereda de la clase AnimalAereo
 * @author alons
 */
public class Pajaro extends AnimalAereo{
    /**
     * atributo tipoPico de la clase Pajaro de tipo String y privado
     */
    private String tipoPico;
    
    /**
     * Constructor que asigna valores a los parametros de la clase super (AnimalAereo)
     * y al atributo tipoPico de la clase Pajaro
     * @param nombre de tipo String
     * @param lugarOrigen de tipo String
     * @param color de tipo String
     * @param tipoPico de tipo String
     */

    public Pajaro(String nombre, String lugarOrigen, String color, int numeroAlas, String tipoPico) {
        super(nombre, lugarOrigen, color, numeroAlas);
        this.tipoPico = tipoPico;
    }
    /**
     * get y set del atributo tipoPico
     */
    public String getTipoPico() {
        return tipoPico;
    }

    public void setTipoPico(String tipoPico) {
        this.tipoPico = tipoPico;
    }
    /**
     * Método que imprime que el pajaro esta comiendo
     */
    public void comer(){
        System.out.println("que ricas semillas");
    }
    /**
     * Método que imprime que el pajaro esta recolectando ramas 
     */
    public void recolectarRamas(){
        System.out.println("Voy a hacer mi casita");
    }
     /**
     * Método de sobreescritura que primero imprime los parámetros de la clase super(clase AnimalAereo)
     * y se concatena el atributo tipoPico de la clase Pajaro
     * @return paramétros de la clase super(clase AnimalAereo)
     * @return param tipoPíco de la clase Pajaro
     */
    @Override
    public String toString() {
        return super.toString() + "Pajaro{" + "tipoPico=" + tipoPico + '}';
    }
    
}
