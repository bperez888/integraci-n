/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package integracion;

import javax.swing.JOptionPane;

/**
 *
 * @author bren
 */
public class ReservasHotel {
    //numero de habitacion
        //cada habitacion tiene un tipo (simple, doble, etc)
        //precio por noche
        //estado de la habitacion: libre, ocupada, sucia o limpia
        
    
        //usar matriz para mostrar las habitaciones del hotel
        
    
        //visualizar el estado de las habitaciones
    
    private int reservas = 0;
    private int seleccionar;
    private String GuardarReserva = "";
    

    public ReservasHotel(int seleccionar) {
        this.seleccionar = seleccionar;
        MenuInicial();
    }

    public void setReservas(int reservas) {
        this.reservas = reservas;
    }
    
    public void MenuInicial() { //para mostrar el menu al empleado para dirigirse a la gestión de las habitaciones
                JOptionPane.showMessageDialog(null, "Por favor, elija la opción que desea realizar");
        
        
        
        
        
        
        
    }
           
    
    
    
            

            

}
