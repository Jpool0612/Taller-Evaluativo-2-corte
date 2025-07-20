/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Model.Huesped;
import java.util.ArrayList;

/**
 *
 * @author Jean pool
 */
public class DAOHuesped {
    
    private ArrayList<Huesped> ListHuesped = new ArrayList<>();
    
    public boolean guardarHuesped(Huesped huesped) {
        for (Huesped h : ListHuesped) {
            if (h.getDocumento().equals(huesped.getDocumento())) {
                return false; // Ya existe
            }
        }
        ListHuesped.add(huesped);
        return true;
    }
    public Huesped buscarPorDocumento(String documento) {
        if (documento == null) return null;
        for (Huesped h : ListHuesped) {
            if (documento.equalsIgnoreCase(h.getDocumento())) {
                return h;
            }
        }
        return null;
    }

    public ArrayList<Huesped> obtenerHuespedes() {
        return ListHuesped;
    }

    public boolean actualizarHuesped(Huesped actualizado) {
        if (actualizado == null) return false;
        String doc = actualizado.getDocumento();
        for (int i = 0; i < ListHuesped.size(); i++) {
            if (ListHuesped.get(i).getDocumento().equalsIgnoreCase(doc)) {
                ListHuesped.set(i, actualizado);
                return true;
            }
        }
        return false;
    }

    public boolean eliminarHuesped(String documento) {
        Huesped h = buscarPorDocumento(documento);
        return h != null && ListHuesped.remove(h);
    }

}
    

