/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clinica_Veterinaria;

import java.util.ArrayList;

/**
 *
 * @author Jean pool
 */
public class Propietario {
    
    private String Nombre;
    private int Documento;
    private int Telefono;
    private ArrayList<Mascota> mascotas = new ArrayList<>();
    
    public void mostrarInformacionCompleta(String Nombre, int Documento, int Telefono){
        
        System.out.println("Informacion del propietario: " + Nombre + Documento + Telefono);
    
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getDocumento() {
        return Documento;
    }

    public void setDocumento(int Documento) {
        this.Documento = Documento;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    public ArrayList<Mascota> getMascotas() {
        return mascotas;
    }

    public void setMascotas(ArrayList<Mascota> mascotas) {
        this.mascotas = mascotas;
    }
    
    
    
}
