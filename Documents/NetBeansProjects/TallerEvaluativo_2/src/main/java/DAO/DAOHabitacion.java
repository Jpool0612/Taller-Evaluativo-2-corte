/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Model.Habitacion;
import java.util.ArrayList;

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
    
    public ArrayList<Habitacion> obtenerHabitaciones() {
        return ListHabitacion; // o new ArrayList<>(listaHabitaciones);
    }

    public boolean actualizarHabitacion(Habitacion habitacionActualizada) {
        if (habitacionActualizada == null) return false;
        int num = habitacionActualizada.getNumero();
        for (int i = 0; i < ListHabitacion.size(); i++) {
            if (ListHabitacion.get(i).getNumero() == num) {
                ListHabitacion.set(i, habitacionActualizada);
                return true;
            }
        }
        return false;
    }

    public boolean eliminarHabitacion(int numero) {
        Habitacion h = buscarPorNumero(numero);
        return h != null && ListHabitacion.remove(h);
    }

}
