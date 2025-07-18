/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;
import modelo.Mascotas;
import DAO.MascotasDAO;
import java.util.ArrayList;

/**
 *
 * @author Jean Pool
 */

public class ControladorMascota {
    private MascotasDAO dao;

    public ControladorMascota() {
        this.dao = new MascotasDAO();
    }

    public boolean guardarMascota(Mascotas mascota) {
    if (mascota == null || mascota.getNombre() == null || mascota.getEspecie() == null || mascota.getId() < 5 || mascota.getEdad() < 0) {
        return false;
    }

    return dao.guardarMascota(mascota); // Llama al método del DAO
}


    public Mascotas buscarMascota(int id ) {
        if (id < 5 ) {
            return null;
        }
        return dao.buscarMascota(id);
    }

    public boolean editarMascota(int id, String nuevoNombre, String nuevaEspecie, int nuevaEdad) {
        if ((id < 5 ) ||
            (nuevoNombre == null || nuevoNombre.isBlank()) ||
            (nuevaEspecie == null || nuevaEspecie.isBlank()) ||
            (nuevaEdad < 0)) {
            return false;
        }
        
        Mascotas actualizada = new Mascotas(nuevoNombre, nuevaEspecie, nuevaEdad, id);
        return dao.actualizarMascota(actualizada);
    }

//        public boolean eliminarMascota(Mascotas mascota) {
//        if (mascota.getId()<0 ) {
//            return false;
//        }
//
//        Mascotas m = dao.buscarMascota(mascota);
//        if (m != null) {
//            return dao.eliminarMascota(m);
//        }
//        return false;
//    }
    
    public ArrayList<Mascotas> buscarPorDocumentoPropietario(String documento) {
    if (documento != null && !documento.equals("")) {
        return dao.buscarUsandoPropietario(documento);
    }
    return new ArrayList<>();
}
    
    public ArrayList<Mascotas> obtenerTodasMascotas(){
        return dao.getMascotas();
    }
}

