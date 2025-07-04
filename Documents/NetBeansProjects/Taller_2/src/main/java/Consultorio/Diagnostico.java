/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Consultorio;

/**
 *
 * @author Jean pool
 */
public class Diagnostico {
// Estas son las variables que va a tener cada diagnóstico: una descripción y un tratamiento
    public String descripcion;
    public String tratamiento;
// Este es el constructor, aquí se reciben los datos y se asignan a las variables del diagnóstico
    public Diagnostico(String descripcion, String tratamiento) {
        this.descripcion = descripcion;
        this.tratamiento = tratamiento;
        
    }
// Este método me permite obtener (consultar) la descripción del diagnóstico
    public String getDescripcion() {
        return descripcion;
    }
// Este método me permite cambiar la descripción si es necesario
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
// Este método me devuelve el tratamiento actual del diagnóstico
    public String getTratamiento() {
        return tratamiento;
    }
// Este método me permite modificar el tratamiento si lo necesito
    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }
 // Este método me ayuda a saber si el tratamiento es largo  
   public boolean esTratamientoLargo(){
    // Si el texto del tratamiento tiene 30 caracteres o más, se considera largo
       if (tratamiento.length() >= 30){
           return true;
       }else {
    // Si tiene menos de 30 caracteres, se considera corto
           return false;
       }
   }
}
