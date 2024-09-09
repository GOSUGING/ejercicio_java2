/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registroasignatura;

/**
 *
 * @author Aron
 */
public class Asignatura {
    private String codAsignatura;
    private String nombreAsignatura;
    private Docente Docente;
    private Estudiante Estudiante;
    private double nota1;
    private double nota2;
    private double nota3;

//constructor 

    public Asignatura(String codAsignatura, String nombreAsignatura, Docente Docente, Estudiante Estudiante, double nota1, double nota2, double nota3) {
        this.codAsignatura = codAsignatura;
        this.nombreAsignatura = nombreAsignatura;
        this.Docente = Docente;
        this.Estudiante = Estudiante;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

// getters 

    public String getCodAsignatura() {
        return codAsignatura;
    }

    public String getNombreAsignatura() {
        return nombreAsignatura;
    }

    public Docente getDocente() {
        return Docente;
    }

    public Estudiante getEstudiante() {
        return Estudiante;
    }

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public double getNota3() {
        return nota3;
    }

// setters

    public void setCodAsignatura(String codAsignatura) {
        this.codAsignatura = codAsignatura;
    }

    public void setNombreAsignatura(String nombreAsignatura) {
        this.nombreAsignatura = nombreAsignatura;
    }

    public void setDocente(Docente Docente) {
        this.Docente = Docente;
    }

    public void setEstudiante(Estudiante Estudiante) {
        this.Estudiante = Estudiante;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    @Override
    public String toString() {
        return " Asignatura " + codAsignatura + " Nombre Asignatura " + nombreAsignatura + " Docente: " + Docente + " Estudiante: " + Estudiante + " Nota 1: " + nota1 + " Nota 2 " + nota2 + " Nota 3 " + nota3;
    }

    
    public double promedio(){
        return  (nota1 / 0.3) + (nota2 / 0.4) + (nota3 + 0.3);
    }

    public String esAprobado(){
        if (promedio() >= 4.0) {
            return "Aprobado";
        } else {
            return "Reprobado";
        }
    }

    

    
    
    
 
}
