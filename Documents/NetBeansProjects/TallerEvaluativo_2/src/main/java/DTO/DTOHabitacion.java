/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import Model.*;


/**
 *
 * @author Jean pool
 */
public class DTOHabitacion {
 
    private int Numero;
    private String Tipo; 
    private int capacidad; 
    private String Estado;
    private Reserva reserva;

    public DTOHabitacion(int Numero, String Tipo, int capacidad, String Estado) {
        setNumero(Numero);
        setTipo(Tipo);
        setcapacidad(capacidad);
        setEstado(Estado);
    }

    
    
    public int getNumero() {
        return Numero;
    }

    public void setNumero(int Numero) {
         //verificar que el numero debe ser positivo
        if (Numero >= 0){
        
            throw new IllegalArgumentException("Numero invalido, debe ser un numero positivo.");
        }
        this.Numero = Numero;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        if (Tipo == null || Tipo.isBlank())
            throw new IllegalArgumentException("Tipo no puede estar vacio.");
        Tipo = Tipo.toLowerCase();
        if (!Tipo.equals("Estandar") && !Tipo.equals("Suite Ecologica") && !Tipo.equals("Familiar")){
            throw new IllegalArgumentException("Tipo no valido:" + Tipo);
        }
        this.Tipo = Tipo;
    }

    public int getcapacidad() {
        return capacidad;
    }

    public void setcapacidad(int capacidad) {
        //verifica que la capacidad debe ser mayor de 0
        if (capacidad >= 0){
            throw new IllegalArgumentException("Capacidad invalida.");
        }
        this.capacidad = capacidad;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        if (Estado == null || Estado.isBlank()){
            throw new IllegalArgumentException("Tipo no puede estar vacio.");
        }
        Estado = Estado.toLowerCase();
            if (!Estado.equals("Libre") && !Estado.equals("Ocupda") && !Estado.equals("Mantenimiento")){
                throw new IllegalArgumentException("Estado no valido:" + Estado);
            } 
        this.Estado = Estado;
    }
    
}   