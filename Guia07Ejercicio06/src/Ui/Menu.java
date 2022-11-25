/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ui;

import Entidad.Cafetera;
import java.util.Scanner;

/**
 *
 * @author LuiG
 */
public class Menu {
    

    public static void menuShow(){
        
        Scanner leer = new Scanner(System.in);
    
        Cafetera nuevaCafetera = new Cafetera();
        int opc;
    
        do {
            System.out.println("1. definir capacidad maxima");
            System.out.println("2. llenar cafetera");
            System.out.println("3. servir taza ");
            System.out.println("4. vaciar cafetera ");
            System.out.println("5. agregar cafe ");
            System.out.println("0. Salir ");
            opc = leer.nextInt();
            
            

            switch(opc){
                case 1:
                    nuevaCafetera.defCapacidadMax();
                    System.out.println(nuevaCafetera.getCantidadActual());
                    break;
                case 2:
                    nuevaCafetera.llenarCafetera();
                    System.out.println(nuevaCafetera.getCantidadActual());
                    break;
                case 3:
                    nuevaCafetera.servirTaza();
                    System.out.println(nuevaCafetera.getCantidadActual());
                    break;
                case 4:
                    nuevaCafetera.vaciarCafetera();
                    System.out.println(nuevaCafetera.getCantidadActual());
                    break;
                case 5:
                    nuevaCafetera.agregarCafe();
                    System.out.println(nuevaCafetera.getCantidadActual());
                    break;
                
                 
                case 0:
                    System.out.println("adios");
                    break;
                    

            }


        } while (opc != 0);
    
    
    }
   

    
    
    
    
    
}
