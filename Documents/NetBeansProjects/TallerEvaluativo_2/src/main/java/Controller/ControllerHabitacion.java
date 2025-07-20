/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAO.DAOHabitacion;
import Exceptions.DatoInvalidoException;
import Exceptions.EntidadNoEncontradaException;
import Model.Habitacion;
import java.util.List;



/**
 *
 * @author Jean pool
 */
public class ControllerHabitacion {
    
    
    private DAOHabitacion daoHabitacion;

    public ControllerHabitacion() {
        this.daoHabitacion = new DAOHabitacion();
    }

    public ControllerHabitacion(DAOHabitacion daoHabitacion) {
        this.daoHabitacion = daoHabitacion;
    }

    // Registrar una nueva habitación
    public boolean registrarHabitacion(int numero, String tipo, int capacidad)
            throws DatoInvalidoException {

        if (numero <= 0 || tipo == null || tipo.isBlank() || capacidad <= 0) {
            throw new DatoInvalidoException("Datos inválidos para registrar habitación.");
        }

        // Validar que el número no se repita
        if (daoHabitacion.buscarPorNumero(numero) != null) {
            throw new DatoInvalidoException("La habitación con número " + numero + " ya existe.");
        }

        Habitacion nueva = new Habitacion(numero, tipo, capacidad, "libre");
        return daoHabitacion.registrarHabitacion(nueva);
    }

    // Buscar por número
    public Habitacion buscarHabitacion(int numero) throws EntidadNoEncontradaException {
        Habitacion h = daoHabitacion.buscarPorNumero(numero);
        if (h == null) {
            throw new EntidadNoEncontradaException("No se encontró la habitación número " + numero);
        }
        return h;
    }

    // Listar todas
    public List<Habitacion> listarHabitaciones() {
        return daoHabitacion.obtenerHabitaciones();
    }

    // Cambiar estado
    public boolean actualizarEstado(int numero, String nuevoEstado) throws EntidadNoEncontradaException {
        Habitacion h = buscarHabitacion(numero);
        h.setEstado(nuevoEstado);
        return true;
    }
}
