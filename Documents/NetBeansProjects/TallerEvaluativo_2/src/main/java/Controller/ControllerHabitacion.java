/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAO.DAOHabitacion;
import Model.Habitacion;



/**
 *
 * @author Jean pool
 */
public class ControllerHabitacion {
    
    private DAOHabitacion DAO;
    
    public ControllerHabitacion(){
        this.DAO = new DAOHabitacion();
    }
    
    public boolean registrarHabitacion(Habitacion habitacion){
        if (habitacion == null || habitacion.getNumero() <= 0 ){
        return false;
        }
            if(DAO.buscarPorNumero(habitacion.getNumero()) != null ){
            return false;//Ya existe una con el mismo numero
            }
    return DAO.registrarHabitacion(habitacion);
    }
}
    
