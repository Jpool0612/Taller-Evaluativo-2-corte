/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clinica_Veterinaria;

/**
 *
 * @author Jean pool
 */
public class Veterinario {
    
    public String nombre;
    public String especialidad;

    public Veterinario(String nombre, String especialidad) {
        setEspecialidad(especialidad);
        setNombre(nombre);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("El nombre del veterinario no puede estar vacío.");
        }
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        if (especialidad == null || especialidad.isBlank()) {
            throw new IllegalArgumentException("La especialidad no puede estar vacía.");
        }
        this.especialidad = especialidad;
    }

    public void mostrarPerfil() {
        System.out.println("Veterinario: " + nombre + "| Especialidad: " + especialidad);

    }

}


//     public String nombre;
//    public String especialidad;
//
//    public Veterinario(String nombre, String especialidad) {
//        this.nombre = nombre;
//        this.especialidad = especialidad;
//        
//        
//    }
//
//}