/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

/**
 *
 * @author Jean pool
 */
import DAO.DAOReserva;
import DAO.DAOHabitacion;
import DAO.DAOHuesped;
import Exceptions.DatoInvalidoException;
import Exceptions.EntidadNoEncontradaException;
import Exceptions.FechaInvalidaException;
import Exceptions.HabitacionNoDisponibleException;
import Model.Habitacion;
import Model.Huesped;
import Model.Reserva;


import java.time.LocalDate;
import java.util.List;

public class ControllerReserva {

    private DAOReserva daoReserva;
    private DAOHuesped daoHuesped;
    private DAOHabitacion daoHabitacion;

    public ControllerReserva() {
        this.daoReserva = new DAOReserva();
        this.daoHuesped = new DAOHuesped();
        this.daoHabitacion = new DAOHabitacion();
    }

    public ControllerReserva(DAOReserva daoReserva, DAOHuesped daoHuesped, DAOHabitacion daoHabitacion) {
        this.daoReserva = daoReserva;
        this.daoHuesped = daoHuesped;
        this.daoHabitacion = daoHabitacion;
    }

    // Registrar reserva
    public boolean registrarReserva(String documentoHuesped, int numeroHabitacion, LocalDate fechaEntrada, LocalDate fechaSalida)
            throws DatoInvalidoException, EntidadNoEncontradaException, FechaInvalidaException, HabitacionNoDisponibleException {

        if (documentoHuesped == null || documentoHuesped.isBlank() || numeroHabitacion <= 0 ||
            fechaEntrada == null || fechaSalida == null) {
            throw new DatoInvalidoException("Datos inválidos para registrar la reserva.");
        }

        if (!fechaSalida.isAfter(fechaEntrada)) {
            throw new FechaInvalidaException("La fecha de salida debe ser posterior a la de entrada.");
        }

        Huesped huesped = daoHuesped.buscarPorDocumento(documentoHuesped);
        if (huesped == null) {
            throw new EntidadNoEncontradaException("Huésped no encontrado con documento: " + documentoHuesped);
        }

        Habitacion habitacion = daoHabitacion.buscarPorNumero(numeroHabitacion);
        if (habitacion == null) {
            throw new EntidadNoEncontradaException("Habitación no encontrada: " + numeroHabitacion);
        }

        // Validar disponibilidad
        if (daoReserva.hayTraslape(numeroHabitacion, fechaEntrada, fechaSalida)) {
            throw new HabitacionNoDisponibleException("La habitación no está disponible en el rango seleccionado.");
        }

       ;
        return daoReserva.guardarReserva(r);
    }

    public List<Reserva> listarReservas() {
        return daoReserva.obtenerReservas();
    }
}

