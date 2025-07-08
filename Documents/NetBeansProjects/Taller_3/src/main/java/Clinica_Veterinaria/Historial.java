/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clinica_Veterinaria;

import java.util.ArrayList;

/**
 *
 * @author Jean pool
 */
public class Historial {
     private ArrayList <Consulta> consultas;
    
    public Historial (){
        this.consultas = new ArrayList<>();
    }
    
    public void agregarConsulta(Consulta con){
        if (con != null){
            consultas.add(con);  
        }
    }
 
    public ArrayList<Consulta> getConsultas() {
        return consultas;
    }

    public void setConsultas(ArrayList<Consulta> consultas) {
        this.consultas = consultas;
    }
    
    public void mostrarConsultas (){
        if (consultas.isEmpty()){
            System.out.println(" Sin consultas registradas");
        }else {
            for (Consulta c : consultas){
                c.mostrarDetallesConsulta();
                System.out.println("-----------------------------");
                
            }
        }
    }
}


