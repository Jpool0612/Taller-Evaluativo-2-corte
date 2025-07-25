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
public class Habitacion {
 
    private int Numero;
    private String Tipo; 
    private int capacidad; 
    private String Estado;
    private Reserva reserva;

    public Habitacion(int Numero, String Tipo, int capacidad, String Estado) {
        setNumero(Numero);
        setTipo(Tipo);
        setcapacidad(capacidad);
        this.Estado = "Libre"; //Siempre empieza Libre
    }

    
    
    public int getNumero() {
        return Numero;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public int getcapacidad() {
        return capacidad;
    }

    public void setcapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {   
        this.Estado = Estado;
    }
    
}   