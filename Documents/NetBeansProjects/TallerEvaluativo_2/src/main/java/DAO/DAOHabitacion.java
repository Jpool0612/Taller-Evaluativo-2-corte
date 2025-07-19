/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Model.Habitacion;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Jean pool
 */
public class DAOHabitacion {
    
    ArrayList <Habitacion> ListHabitacion = new ArrayList<>();
    
    public boolean registrarHabitacion(Habitacion habitacion){
        for (Habitacion u : ListHabitacion){
            if (u.getNumero() == habitacion.getNumero())//verifica en el ArrayList si ya existe
                return false;
        
        }
     return ListHabitacion.add(habitacion);
    } 
    
    public Habitacion buscarPorNumero(int Numero){
        for (Habitacion u : ListHabitacion){
            if (u.getNumero() == Numero){//verifica en el ArrayList si ya existe
                return u;
            }
            
        }
        return null;
    }
    
    
}
