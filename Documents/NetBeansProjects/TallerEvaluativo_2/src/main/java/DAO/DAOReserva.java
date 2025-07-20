/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Model.Reserva;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jean pool
 */
public class DAOReserva {
    private ArrayList<Reserva> listaReservas = new ArrayList<>();
    private int secuenciaId = 1; 
    
        public Reserva guardarReserva(Reserva r) {
        if (r == null) return null;
        // Si quieres auto-ID:
        if (r.getReserva() == 0) {
            r.setReserva(secuenciaId++);
        }
        listaReservas.add(r);
        return r;
    }

    public Reserva buscarPorId(int id) {
        for (Reserva r : listaReservas) {
            if (r.getReserva() == id) return r;
        }
        return null;
    }

    public ArrayList<Reserva> listarReservas() {
        return listaReservas;
    }

    public ArrayList<Reserva> listarPorHabitacion(int numeroHabitacion) {
        ArrayList<Reserva> res = new ArrayList<>();
        for (Reserva r : listaReservas) {
            if (r.getHabitacion().equals(numeroHabitacion)) {
                res.add(r);
            }
        }
        return res;
    }

    public boolean eliminarReserva(int id) {
        Reserva r = buscarPorId(id);
        return r != null && listaReservas.remove(r);
    }

    // Soporte para disponibilidad
    public boolean hayTraslape(int numeroHabitacion, LocalDate entrada, LocalDate salida) {
        for (Reserva r : listaReservas) {
            if (r.getHabitacion().equals(numeroHabitacion)) {
                LocalDate e = r.getFechaEntrada();
                LocalDate s = r.getFechaSalida();
                if (fechasTraslapan(entrada, salida, e, s)) {
                    return true;
                }
            }
        }
        return false;
    }
     private boolean fechasTraslapan(LocalDate aIni, LocalDate aFin,
                                    LocalDate bIni, LocalDate bFin) {
        // A < BFin && BIni < AFin
        return aIni.isBefore(bFin) && bIni.isBefore(aFin);
    }
     public List<Reserva> obtenerReservas() {
    return new ArrayList<>(listaReservas);
}
}


