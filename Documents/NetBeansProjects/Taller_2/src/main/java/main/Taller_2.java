/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;


import Consultorio.Consulta;
import Consultorio.Diagnostico;
/**
 *
 * @author Jean pool
 */
public class Taller_2 {
    
    
    public static void main(String[] args) {
     // Aquí creo un diagnóstico nuevo, con una descripción del problema y el tratamiento recomendado.
        Diagnostico d = new Diagnostico("Infección", "Administrar antibiotico topico durante 10 días y monitorear reaccion.");
     // Luego creo una consulta, donde le asigno un código, una fecha y el diagnóstico que ya había creado.
        Consulta c = new Consulta("#C008", "2025-07-04", d);
    // Finalmente muestro toda la información de la consulta por pantalla  
        c.mostrarConsulta();
       
   }
}
    
