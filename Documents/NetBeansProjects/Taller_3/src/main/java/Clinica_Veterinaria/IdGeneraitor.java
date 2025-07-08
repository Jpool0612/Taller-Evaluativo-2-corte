    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clinica_Veterinaria;

/**
 *
 * @author Jean Pool
 */
public class IdGeneraitor {
        private static int contadorConsulta = 0;
    private static int contadorMascota = 0;

    public static String generarCodigoConsulta() {
        return "C" + (++contadorConsulta);
    }

    public static String generarCodigoMascota() {
        return "M" + (++contadorMascota);
    }
}

