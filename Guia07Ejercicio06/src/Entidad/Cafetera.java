/*
 * Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la cantidad
actual de café que hay en la cafetera). Implemente, al menos, los siguientes métodos:
? 

*/
package Entidad;

import java.util.Scanner;

/**
 *
 * @author LuiG
 */
public class Cafetera {
    Scanner leer = new Scanner(System.in);
    private int capacidadMaxima;
    private int cantidadActual;
    //const

    public Cafetera() {
    }

    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }
    //get and set

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public String getCantidadActual() {
        return cantidadActual + " Mlts";
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
    // metodos
    
    public void defCapacidadMax(){
        System.out.println("ingresa la capacidad maxima");
        this.capacidadMaxima = leer.nextInt();
    }
    
    
    
    public void llenarCafetera(){
        
        this.cantidadActual = this.capacidadMaxima;
    
    }
    
    public void servirTaza(){
        
        int taza;
        System.out.println("ingresa tamano taza");
        taza = leer.nextInt();
        if(taza>this.cantidadActual){
            System.out.println("no se pudo llenar tu taza");
            System.out.println("se lleno tu taza con "+ this.getCantidadActual());
            this.cantidadActual=0;
        }else{
            this.cantidadActual -= taza; 
        }
        
        
    }
    
    public void vaciarCafetera(){
        this.cantidadActual=0;
    }
    
    public void agregarCafe(){
        int cafe;
       
        do {
            
            System.out.println("cuanto cafe quieres agregar");
            cafe = leer.nextInt();
            if(cafe>this.capacidadMaxima || this.capacidadMaxima <(this.cantidadActual+cafe)){
              System.out.println("el cafe excede la capacidad maxima");
              this.cantidadActual = this.cantidadActual;
            }else{
              this.cantidadActual+=cafe;

            }
          
            
        } while (cafe>this.capacidadMaxima);
        
    }
    
    
}
