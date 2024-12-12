/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package integracion;

import java.util.Scanner;

/**
 *
 * @author bren
 */
public class GestionHabitaciones {

    public GestionHabitaciones() {
        volverAlMenu();
    }

    private void volverAlMenu() {
        
    }
    
    //caracteristicas
    private int numeroHabitacion;
    private String tipoHabitacion;
    private int precioHabitacion;
    private String estadoHabitacion;
    
    //matriz
    int piso = 6;
    int habitacion = 5;
    int[][] habitaciones = new int[piso][habitacion];

    Scanner scanner = new Scanner(System.in);
    boolean continuar = true;

    public void ReservaHabitaciones() {
        while (continuar) {
            mostrarHabitaciones(habitaciones);

            //para seleccionar habitación
            System.out.println("\nIntroduzca el piso de la habitación (0-4):");
            int fila = scanner.nextInt();

            System.out.println("Introduzca el numero de habitación (0-4):");
            int columna = scanner.nextInt();

            //verificar si la habitación está disponible
            if (habitaciones[piso][habitacion] == 0) {
                habitaciones[piso][habitacion] = 1;
                System.out.println("La habitación está libre");
            } else {
                System.out.println("La habitación se encuentra ocupada");

            }
            System.out.println("desea continuar? (s/n):");
            String respuesta = scanner.next();
            if (respuesta.equalsIgnoreCase("n")) {
                continuar = false;
                System.out.println("gracias por reservar");
            }
        }
    }

    //para mostrar las habitaciones
    public void mostrarHabitaciones(int[][] habitaciones) {
        System.out.println("\nEstado de disponibilidad de los habitaciones: ");
        System.out.println("    ");

        for (int i = 0; i < habitaciones[0].length; i++) {
            System.out.println(i + "    ");
        }
        System.out.println();

        for (int i = 0; i < habitaciones.length; i++) {
            System.out.println(i + "    ");

            for (int j = 0; j < habitaciones[i].length; j++) {
                System.out.print((habitaciones[i][j] == 0 ? "L" : "O") + "  ");

            }

        }
        }
    }



    

    

