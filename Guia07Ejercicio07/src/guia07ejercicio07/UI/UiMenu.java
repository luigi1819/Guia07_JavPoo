/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia07ejercicio07.UI;

import guia07ejercicio07.Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author LuiG
 */
public class UiMenu {
    
    public static void menuPersona(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int selec = 0;
        
        
        Persona primeraPersona = new Persona();
    
        
        
        do {
            
            System.out.println("Escoge el numero para ejecutar la eleccion");
            System.out.println("1. Insertar Datos Persona");
            System.out.println("2. Calcular IMC");
            System.out.println("3. Es Mayor de Edad? ");
            System.out.println("4. Imprimir ");
            System.out.println("0. Salir");
            selec = leer.nextInt();
            

            switch(selec){
                case 1:
                    primeraPersona.crearPersona();
                    break;

                case 2:
                    primeraPersona.calcularIMC();
                    break;
                case 3:
                    primeraPersona.mayorEdad();
                    break;
                case 4:
                    System.out.println(primeraPersona.toString());
                    break;
                case 0:

                    break;


            }
        
       
    
    
       
            
            
        } while (selec != 0);
        

    
    
    
    
    
    
}
}