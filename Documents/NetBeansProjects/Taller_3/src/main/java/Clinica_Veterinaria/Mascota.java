/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clinica_Veterinaria;

import java.util.ArrayList;

/**
 *
 * @author Jean Pool
 */
public class Mascota {
    
    private String Nombre;
    private String Especie;
    private int Edad;
    private ArrayList<Consulta> Consulta = new ArrayList<>();
    
    public void mostrarHistorial(String Nombre, String Especie, int Edad){
    
           System.out.println("Informacion de la mascota" + Nombre + Especie + Edad);
    
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getEspecie() {
        return Especie;
    }

    public void setEspecie(String Especie) {
        this.Especie = Especie;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public ArrayList<Consulta> getConsulta() {
        return Consulta;
    }

    public void setConsulta(ArrayList<Consulta> Consulta) {
        this.Consulta = Consulta;
    }
    
    
    
}
