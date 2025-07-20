/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author Jean pool
 */
public class Huesped {
    
    private String Nombre;
    private String Documento;
    private String Correo;
    private String Telefono;
    private Reserva reserva;

    public Huesped(String Nombre, String Documento, String Correo, String Telefono) {
        setNombre(Nombre);
        setDocumento(Documento);
        setCorreo(Correo);
        setTelefono(Telefono);
        
    }
    
    

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDocumento() {
        return Documento;
    }

    public void setDocumento(String Documento) {
        this.Documento = Documento;
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
        this.Correo = Correo;
        
    }

    public String getTelefono() {
        return Telefono;
    }

    

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }
}

    
    

