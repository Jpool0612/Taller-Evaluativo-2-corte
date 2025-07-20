/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import Model.*;
import java.time.LocalDate;
import java.util.ArrayList;



/**
 *
 * @author Jean pool
 */
public class DTOReserva {
    
    private int reserva;
    private LocalDate FechaEntrada;
    private LocalDate FechaSalida;
    private ArrayList<Huesped> huesped = new ArrayList<>();
    private ArrayList<Habitacion> habitacion = new ArrayList<>();

    public DTOReserva(int reserva, LocalDate FechaEntrada, LocalDate FechaSalida, ArrayList<Huesped> huesped, ArrayList<Habitacion> habitacion) {
        this.reserva = reserva;
        this.FechaEntrada = FechaEntrada;
        this.FechaSalida = FechaSalida;
    }

    public int getReserva() {
        return reserva;
    }

    public void setReserva(int reserva) {
        this.reserva = reserva;
    }

    public LocalDate getFechaEntrada() {
        return FechaEntrada;
    }

    public void setFechaEntrada(LocalDate FechaEntrada) {
        this.FechaEntrada = FechaEntrada;
    }

    public LocalDate getFechaSalida() {
        return FechaSalida;
    }

    public void setFechaSalida(LocalDate FechaSalida) {
        this.FechaSalida = FechaSalida;
    }

    public ArrayList<Huesped> getHuesped() {
        return huesped;
    }

    public void setHuesped(ArrayList<Huesped> huesped) {
        this.huesped = huesped;
    }

    public ArrayList<Habitacion> getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(ArrayList<Habitacion> habitacion) {
        this.habitacion = habitacion;
    }
    
    
    
    
}
