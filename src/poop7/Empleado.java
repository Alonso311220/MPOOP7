/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7;

/**
 * Clase padre de Gerente
 * @author poo08alu04
 */
public class Empleado {
    private String nombre;
    private int numEmpleado;
    private int sueldo;
    /**
     * constructor vacio
     */
    public Empleado() {
    }
    /**
     * constructor que asigna los valores a los atributos de la clase Empleado
     * @param nombre de tipo String
     * @param numEmpleado de tipo int
     * @param sueldo de tipo int
     */
    public Empleado(String nombre, int numEmpleado, int sueldo) {
        this.nombre = nombre;
        this.numEmpleado = numEmpleado;
        this.sueldo = sueldo;
    }
    /**
     * setters and getters
     */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumEmpleado() {
        return numEmpleado;
    }

    public void setNumEmpleado(int numEmpleado) {
        this.numEmpleado = numEmpleado;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
    /**
     * Método que aumenta el sueldo del Empleado
     * @param porcentaje de tipo int 
     */
    public void aumentarSueldo(int porcentaje){
        sueldo += sueldo * porcentaje/100;
    }
    /**
     * Método que imprime que el Empleado está trabajando
     */
    public void trabajar(){
        System.out.println("estoy trabajando ._.");
    }
    /**
     * Método de sobreescritura que regresa la información de la clase Empleado
     * @return param nombre
     * @return param numEmpleado
     * @return param sueldo
     */
    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", numEmpleado=" + numEmpleado + ", sueldo=" + sueldo + '}';
    }
    
}
