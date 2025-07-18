/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import modelo.Historial;
import DTO.MascotasDTO;
import java.util.ArrayList;
import modelo.Consulta;
import modelo.Mascotas;

/**
 *
 * @author MI PC
 */
public class MascotasDAO {
    
    private ArrayList<Mascotas> listaMascotas = new ArrayList<>();

    public boolean guardarMascota(Mascotas mascota) {
        for (Mascotas m : listaMascotas){
            if( m.getId() == (mascota.getId())){
                return false;
            }
        }
        listaMascotas.add(mascota);
        return true;
    }

    public boolean actualizarMascota(Mascotas mascota) {
        for (Mascotas m : listaMascotas) {
            if (m.getId() == mascota.getId()) {
                m.setEdad(mascota.getEdad());
                m.setEspecie(mascota.getEspecie());
                m.setNombre(mascota.getNombre());
                return true;
            }
        }
        return false;
    }
    public ArrayList<Mascotas> getMascotas() {
    return listaMascotas;
}


    public boolean eliminarMascota(Mascotas mascota) {
        for (Mascotas m : listaMascotas) {
            if (m.getId() == mascota.getId()) {
                listaMascotas.remove(m);
                return true;
            }
        }
        return false;
    }

    public Mascotas buscarMascota(int id) {
        for (Mascotas m : listaMascotas) {
            if (m.getId() == id) {
                return m;
            }
        }
        return null;
    }

    public ArrayList<Mascotas> buscarUsandoPropietario(String documento) {
        ArrayList<Mascotas> devolverMas = new ArrayList<>();
        for (Mascotas m : listaMascotas) {
            if (m.getDocumentoProp().equals(documento)) {
                devolverMas.add(m);
            }
        }
        return devolverMas;
    }
}
