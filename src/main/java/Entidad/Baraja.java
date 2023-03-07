/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.ArrayList;

/**
 *
 * @author 54343
 */
public class Baraja {
    private Integer numero;
    private String palo;
    private ArrayList<Baraja> baraja;

    public Baraja() {
    }

    public Baraja(Integer numero, String palo) {
        this.numero = numero;
        this.palo = palo;
    }    
    
   
    public Baraja(ArrayList<Baraja> baraja) {
        this.baraja = baraja;
    }
    
    

    public Integer getNumero() {
        return numero;
    }

    public String getPalo() {
        return palo;
    }

    public ArrayList<Baraja> getBaraja() {
        return baraja;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    public void setBaraja(ArrayList<Baraja> baraja) {
        this.baraja = baraja;
    }

    @Override
    public String toString() {
        return "Carta[" + numero + " de " + palo + ']';
    }
    
    
    
    
}

