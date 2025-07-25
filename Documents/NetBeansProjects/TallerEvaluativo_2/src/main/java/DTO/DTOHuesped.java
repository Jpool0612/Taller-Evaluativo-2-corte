/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import Model.*;
import java.util.ArrayList;

/**
 *
 * @author Jean pool
 */
public class DTOHuesped {
    
    private String Nombre;
    private String Documeto;
    private String Correo;
    private int Telefono;
    private Reserva reserva;

    public DTOHuesped(String Nombre, String Documeto, String Correo, int Telefono) {
        setNombre(Nombre);
        setDocumeto(Documeto);
        setCorreo(Correo);
        setTelefono(Telefono);
        
    }
    
//    public void mostrarReserva(){
//        for(reserva m : Reserva) {
//        
//            m.mostrarInfo();
//        }
//    
//    }
    
    
    

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDocumeto() {
        return Documeto;
    }

    public void setDocumeto(String Documeto) {
        this.Documeto = Documeto;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
         // verifica que el correo tenga @ y no este vacio
        if (Correo == null || Correo.isBlank() || !Correo.contains("@")) {
            throw new IllegalArgumentException("Correo invalido."); 
        }
        this.Correo = Correo;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }
}

    
    

