/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAO.DAOHuesped;
import Model.Huesped;

/**
 *
 * @author Jean Pool
 */
public class ControllerHuesped {
    
    private DAOHuesped DAO;
    
    public ControllerHuesped(){
    
        this.DAO = new DAOHuesped();
    
    }
    
    public boolean guardarHuesped(Huesped huesped){
        if(huesped == null || huesped.getNombre() == null || huesped.getDocumeto() == null || !huesped.getCorreo().contains("@") || huesped.getCorreo() == null || huesped.getTelefono() <= 7  ){
        
            return false;
        }
    return DAO.guardarHuesped(huesped); // llama al metodo DAO
    }
    
    
}
