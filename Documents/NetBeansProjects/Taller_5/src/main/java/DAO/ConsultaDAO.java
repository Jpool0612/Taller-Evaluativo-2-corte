/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.util.ArrayList;
import modelo.Consulta;

/**
 *
 * @author Kevin
 */
public class ConsultaDAO {
    
    private ArrayList<Consulta> listaConsulta = new ArrayList<>();

    public ConsultaDAO() {
    }
    
    public boolean guardarConsulta (Consulta consulta){
        for (Consulta c : listaConsulta){
            if(c.getCodigo().equals(consulta.getCodigo())){
                return false;
            }
        }
        return listaConsulta.add(consulta);
    } 
    public boolean editarConsulta(Consulta consulta){
    for (Consulta c : listaConsulta){
        if (c.getCodigo().equals(consulta.getCodigo())){
            c.setFecha(consulta.getFecha().toString()); 
            c.setVeterinario(consulta.getVeterinario());
            return true; 
        }
    }
    return false;
}

    
    public boolean eliminarConsulta (Consulta consulta){
        for ( Consulta c: listaConsulta){
            if(c.getCodigo().equals(consulta.getCodigo())){
               return listaConsulta.remove(c);   
            }
        }
        return false;
    }
    public Consulta buscarConsulta(Consulta consulta){
        for(Consulta c : listaConsulta){
            if(c.getCodigo().equals(consulta.getCodigo())){
            return c;
            }
        }
        return null;
    }
    public ArrayList<Consulta> obtenerTodas() {
        return new ArrayList<>(listaConsulta);
}
}
