/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registroasignatura;
import java.util.Scanner;


/**
 *
 * @author Aron
 */
public class Menu {

    public static void mostrarMenu(Estudiante estudiante, Docente docente) {
        try (Scanner scanner = new Scanner(System.in)) {
            double nota1 = 0.0, nota2 = 0.0, nota3 = 0.0;
            String codAsignatura = "", nombreAsignatura = "";
            boolean salir = false;

            while (!salir) {
                System.out.println("\n--- Menú ---");
                System.out.println("1.- Ingresar Datos ");
                System.out.println("2.- Ingresar Notas");
                System.out.println("3.- Mostrar promedios y estado");
                System.out.println("4.- Salir");
                System.out.print("Elija una opción: ");
                
                int opcion = scanner.nextInt();
                scanner.nextLine(); 

                switch (opcion) {
                    case 1 -> {
                        System.out.print("Ingrese el Código de Asignatura: ");
                        codAsignatura = scanner.nextLine();
                        System.out.print("Ingrese Nombre de Asignatura: ");
                        nombreAsignatura = scanner.nextLine();
                    }

                    case 2 -> {
                        System.out.print("Ingrese la Primera Nota: ");
                        nota1 = scanner.nextDouble();
                        scanner.nextLine(); 
                        System.out.print("Ingrese la Segunda Nota: ");
                        nota2 = scanner.nextDouble();
                        scanner.nextLine(); 
                        System.out.print("Ingrese la Tercera Nota: ");
                        nota3 = scanner.nextDouble();
                        scanner.nextLine(); 
                    }

                    case 3 -> {
                        if (!codAsignatura.isEmpty() && !nombreAsignatura.isEmpty()) {
                            Asignatura asignatura1 = new Asignatura(codAsignatura, nombreAsignatura, docente, estudiante, nota1, nota2, nota3);
                            
                            System.out.println("Asignatura: " + nombreAsignatura + " (" + codAsignatura + ")");
                            System.out.println("Promedio Asignatura: " + asignatura1.promedio());
                            System.out.println("Estado: " + asignatura1.esAprobado());
                        } else {
                            System.out.println("Debe ingresar los datos de la asignatura primero.");
                        }
                    }

                    case 4 -> {
                        salir = true;
                        System.out.println("Saliendo del programa...");
                    }

                    default -> System.out.println("Ingrese una opción válida, por favor intente nuevamente.");
                }
            }
        }
    }
}
