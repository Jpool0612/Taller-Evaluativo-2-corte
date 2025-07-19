/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Model.Huesped;
import java.util.ArrayList;

/**
 *
 * @author Jean pool
 */
public class DAOHuesped {
    
    private ArrayList<Huesped> ListHuesped = new ArrayList<>();
    
    public boolean guardarHuesped(Huesped huesped) {
        for (Huesped h : ListHuesped) {
            if (h.getDocumeto().equals(huesped.getDocumeto())) {
                return false; // Ya existe
            }
        }
        ListHuesped.add(huesped);
        return true;
    }
    
}
    

