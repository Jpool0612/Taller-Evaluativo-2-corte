/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Consultorio;

/**
 *
 * @author Jean pool
 */
public class Consulta {

// Estas son las variables que va a tener cada consulta: un código, una fecha y un diagnóstico
    public String codigo;
    public String fecha;
    public Diagnostico diag;
// Este es el constructor, aquí es donde se inicializa una consulta con sus datos
    public Consulta(String codigo, String fecha, Diagnostico diag) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.diag = diag;
    }

    /**
     * Muestra la información completa de la consulta en consola,
     * incluyendo código, fecha, descripción del diagnóstico, tratamiento
     * y una recomendación si el tratamiento es largo.
     */
    public void mostrarConsulta() {
        System.out.println(
            "Consulta: " + codigo + "\n" +
            "Fecha: " + fecha + "\n" +
            "Diagnóstico asociado:\n" +
            "Descripción: " + diag.getDescripcion() + "\n" +
            "Tratamiento: " + diag.getTratamiento() + "\n"
        );

        if (diag.esTratamientoLargo()) {
            System.out.println("El tratamiento es extenso, se requiere seguimiento adicional.");
        } else {
            System.out.println("El tratamiento es corto, por lo tanto no requiere seguimiento.");
        }
    }
}



