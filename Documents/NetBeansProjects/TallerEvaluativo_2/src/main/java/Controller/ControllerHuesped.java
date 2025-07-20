/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAO.DAOHuesped;
import Exceptions.DatoInvalidoException;
import Exceptions.EntidadNoEncontradaException;
import Model.Huesped;
import java.util.List;

/**
 *
 * @author Jean Pool
 */
public class ControllerHuesped {
    
    private DAOHuesped DAO;
    
    public ControllerHuesped(){
       this.daoHuesped = new DAOHuesped();
    }
        private DAOHuesped daoHuesped;

    
     

    public ControllerHuesped(DAOHuesped daoHuesped) {
        this.daoHuesped = daoHuesped;
    }

    // Registrar huésped
    public boolean registrarHuesped(String nombre, String documento, String correo, String telefono)
            throws DatoInvalidoException {

        if (nombre == null || nombre.isBlank() ||
            documento == null || documento.isBlank() ||
            correo == null || correo.isBlank() || !correo.contains("@") ||
            telefono == null || telefono.isBlank()) {
            throw new DatoInvalidoException("Datos inválidos para registrar huésped.");
        }

        if (daoHuesped.buscarPorDocumento(documento) != null) {
            throw new DatoInvalidoException("El documento ya está registrado para otro huésped.");
        }

        Huesped nuevo = new Huesped(nombre, documento, correo, telefono);
        return daoHuesped.guardarHuesped(nuevo);
    }

    // Buscar huésped por documento
    public Huesped buscarHuesped(String documento) throws EntidadNoEncontradaException {
        Huesped h = daoHuesped.buscarPorDocumento(documento);
        if (h == null) {
            throw new EntidadNoEncontradaException("No se encontró el huésped con documento " + documento);
        }
        return h;
    }

    // Listar huéspedes
    public List<Huesped> listarHuespedes() {
        return daoHuesped.obtenerHuespedes();
    }
}

    

