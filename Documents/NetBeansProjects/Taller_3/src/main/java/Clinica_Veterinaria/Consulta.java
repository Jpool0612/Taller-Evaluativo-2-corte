/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clinica_Veterinaria;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

/**
 *
 * @author Jean pool
 */
public class Consulta {
    
//     private int codigo;
//     private String fecha;
//    
//    Veterinario vet = new Veterinario("Carlos", " anastesiologo");
//
//    public Consulta(int codigo, String fecha) {
//        this.codigo = codigo;
//        this.fecha = fecha;
//       
//    }
//     
//     public void mostrarDetallesConsulta(){
//         System.out.println("Detalles Consulta");
//         System.out.println("Codigo:"+ this.codigo );
//         System.out.println("Fecha:"+ this.fecha);
//         System.out.println("Nombre:"+ vet.nombre);
//         System.out.println("Especialidad:"+ vet.especialidad);     
//     }
//}
  private String codigo;
    private LocalDate fecha;


    private Veterinario vet;

    public Consulta(String codigo, String fecha, Veterinario vet) {
        setCodigo(codigo);
        setFecha(fecha);
        setVet(vet);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        if (codigo == null || codigo.isBlank()) {
            throw new IllegalArgumentException("Código inválido.");
        }
        this.codigo = codigo;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(String fechaText) {
        try {
            this.fecha = LocalDate.parse(fechaText);
         }catch(DateTimeParseException e){
           throw new IllegalArgumentException(" formato de fecha no valido");
        }

    }

    public Veterinario getVet() {
        return vet;
    }

    public void setVet(Veterinario vet) {
        if (vet == null) {
            throw new IllegalArgumentException("Veterinario requerido");
        }
        this.vet = vet;
    }

//    public void mostrarDetallesConsulta() {
//        System.out.println("Detalles Consulta");
//        System.out.println("Codigo:" + thiscodigo);
//        System.out.println("Fecha:" + this.fecha);
//        System.out.println("Nombre:" + vet.nombre);
//        System.out.println("Especialidad:" + vet.especialidad);
    public void mostrarDetallesConsulta() {
        System.out.println("Detalles Consulta");
        System.out.println("Codigo:" + codigo);
        System.out.println("Fecha:" + fecha);
        if ( vet != null ){
            vet.mostrarPerfil();
        }else{
            System.out.println(" Sin veterinario asignado");
        }

    }
}
  