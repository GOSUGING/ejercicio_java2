/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package registroasignatura;



/**
 *
 * @author Aron
 */
public class RegistroAsignatura {

    
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Aron Suy", "18618427-0", "11/12/1995", 28);
        Docente docente1 = new Docente("Hernan Saavedra", "98989888-9", 20, "20/02/1998", "Viña del Mar");
        Menu.mostrarMenu(estudiante1, docente1);
       
    }
    
}
