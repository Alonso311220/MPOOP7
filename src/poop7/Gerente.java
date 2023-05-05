/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7;

/**
 * Clase Gerente que se hereda de la clase Empleado
 * @author poo08alu04
 */
public class Gerente extends Empleado{
    /**
     * atributo presupuesto de la clase Empleado de tipo int y privado
     */
    private int presupuesto;

    public Gerente() {
    }
    /**
     * Constructor que asigna valores a los parametros de la clase super(Empleado) y asigna
     * un valor al atributo presupuesto de la clase Gerente
     * @param nombre de tipo String
     * @param numEmpleado de tipo int
     * @param sueldo de tipo int
     * @param presupuesto de tipo int
     */
    public Gerente(String nombre, int numEmpleado, int sueldo, int presupuesto) {
        super(nombre, numEmpleado, sueldo); //constructor de Empleado(clase superior)
        this.presupuesto = presupuesto;
    }
    /**
     * get and set de Presupuesto
     */
    public int getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(int presupuesto) {
        this.presupuesto = presupuesto;
    }
    /**
     * Método que asigna un valor al atributo presupuesto
     */
    public void asignarPresupuesto(){
        presupuesto = getSueldo() * 10;
    }
    /**
     * Método de sobreescritura donde primero se imprimen los parámetros de la clase super(clase Empleado)
     * y se concatena el atributo presupuesto de la clase Gerente
     * @return paramétros de la clase super(clase Empleado)
     * @return param presupuesto
     */
    @Override
    public String toString() {
        return super.toString() + "Gerente{" + "presupuesto=" + presupuesto + '}'; //con el super.toString mandamos a llamar la sobrescritura de la clase super(clase padre)
    }
    
}
