/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author MI PC
 */
public class IDGenerator {
      // Contador interno estático (se comparte en todas las llamadas)
    private static int contador = 1;

    // Método estático que genera el ID único
    public static String generateReservaId() {
        String id = "RES-" + contador;
        contador++; // Incrementamos para el siguiente ID
        return id;
    }
}

