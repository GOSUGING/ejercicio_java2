/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registroasignatura;

/**
 *
 * @author Aron
 */
public class Estudiante {
    private String nombre;
    private String rut;
    private String fechaNacimiento;
    private int edad;
    
// constructor 

    public Estudiante(String nombre, String rut, String fechaNacimiento, int edad) {
        this.nombre = nombre;
        this.rut = rut;
        this.fechaNacimiento = fechaNacimiento;
        this.edad = edad;
    }
// getters

    public String getNombre() {
        return nombre;
    }

    public String getRut() {
        return rut;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public int getEdad() {
        return edad;
    }
// setters 

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return    nombre + " Rut: " + rut + " Fecha de Nacimiento" + fechaNacimiento + " Edad: " + edad;
    }
    
    
}
