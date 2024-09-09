/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registroasignatura;

/**
 *
 * @author Aron
 */
public class Docente {
    private String nombre;
    private String rut;
    private int numeroDocente;
    private String fechaIngreso;
    private String sede;
    
//constructor

    public Docente(String nombre, String rut, int numeroDocente, String fechaIngreso, String sede) {
        this.nombre = nombre;
        this.rut = rut;
        this.numeroDocente = numeroDocente;
        this.fechaIngreso = fechaIngreso;
        this.sede = sede;
    }

// getters

    public String getNombre() {
        return nombre;
    }

    public String getRut() {
        return rut;
    }

    public int getNumeroDocente() {
        return numeroDocente;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public String getSede() {
        return sede;
    }

// setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public void setNumeroDocente(int numeroDocente) {
        this.numeroDocente = numeroDocente;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    @Override
    public String toString() {
        return  nombre + " Rut: " + rut + " Numero docente: " + numeroDocente + " Fecha de Ingreso " + fechaIngreso + " Sede: " + sede;
    }
    
    
    
    
}
