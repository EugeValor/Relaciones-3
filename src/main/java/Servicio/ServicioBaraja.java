/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Baraja;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
/**
 *
 * @author 54343
 */
public class ServicioBaraja {
    
     public ArrayList<Baraja> crearBaraja(){
        ArrayList<Baraja> baraja = new ArrayList<>();
        
        for (char i = 'a'; i < 'e'; i++) {            
            for (Integer j = 1; j < 13; j++) {
                if (j == 9 || j == 8){
                    continue;                    
                }
                Baraja carta = new Baraja();
                carta.setNumero(j);
                switch (i){
                    case 'a':
                        carta.setPalo("Copa");
                        break;
                    case 'b':
                        carta.setPalo("Oro");
                        break;
                    case 'c':
                        carta.setPalo("Espada");
                        break;
                    case 'd':
                        carta.setPalo("Basto");
                        break;                       
                }                
                baraja.add(carta);
            }                
        }
        return baraja;                
        
    }
    
    public void barajar(ArrayList<Baraja> b){
        Collections.shuffle(b);
    }
    
    public Baraja siguienteCarta(ArrayList<Baraja> b){
        if (b.size() == 0){
            System.out.println("No hay mas cartas disponibles");
            return null;
        } else {
            System.out.println("La carta siguiente es: ");
            System.out.println(b.get(0));
            return b.get(0);  
        }
        
    }
    
    public void cartasDisponibles(ArrayList<Baraja> b){
        
        if (b.size() > 0){
            System.out.println("Cartas disponibles: " + b.size());
        }
    }
    
    public void darCartas(ArrayList<Baraja> b, ArrayList<Baraja> m){
        Scanner leer = new Scanner(System.in);
        System.out.println("¿Cuantas cartas desea?");
        int cantidad = leer.nextInt();
        if (b.size() < cantidad){
            System.out.println("La cantidad de cartas disponibles es menor a la cantidad de cartas deseada");            
        } else {
            System.out.println("Las nuevas cartas son: ");
            int contador = 0;           
            Iterator it = b.iterator();
            while (it.hasNext() && contador != cantidad){
                Baraja a = (Baraja) it.next();
                m.add(a);                
                System.out.println(a);
                contador++;
                b.remove(a);
            }
            
        }            
    }
    
    public void cartasMonton(ArrayList<Baraja> m){
       
        if (m.size() == 0){
            System.out.println("No hay cartas fuera de la baraja");
        } else {
             System.out.println("Las cartas del monton son: ");
            for (Baraja monton : m) {
                System.out.println(monton);
            }
        }
    }
    
    public void mostrarCartas(ArrayList<Baraja> b){
        System.out.println("Las cartas de la baraja son: ");
        for (Baraja baraja : b) {
            System.out.println(baraja);            
        }
    }
    
    
}