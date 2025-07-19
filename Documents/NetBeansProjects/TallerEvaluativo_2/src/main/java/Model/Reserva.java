/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.time.LocalDate;

/**
 *
 * @author Jean pool
 */
public class Reserva {
    
    private int reserva;
    private LocalDate FechaEntrada;
    private LocalDate FechaSalida;
    private Huesped huesped;
    private Habitacion habitacion;

    public Reserva(int reserva, LocalDate FechaEntrada, Huesped huesped, Habitacion habitacion) {
        setReserva(reserva);
        setFechaEntrada(LocalDate.now());//genera fecha actual
        setHuesped(huesped);
        setHabitacion(habitacion);
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
        this.FechaEntrada = LocalDate.now();//muestra Fecha del dia de entrada
    }
 
    
    public LocalDate getFechaSalida() {
        return FechaSalida;
    }

    public void setFechaSalida(LocalDate FechaSalida) {
        this.FechaSalida = LocalDate.now();//muestra fecha del dia que sale
    }

    public Huesped getHuesped() {
        return huesped;
    }

    public void setHuesped(Huesped huesped) {
        this.huesped = huesped;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }
    
    
    
}
