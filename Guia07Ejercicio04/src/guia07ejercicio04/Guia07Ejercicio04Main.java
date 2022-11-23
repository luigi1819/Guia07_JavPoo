/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia07ejercicio04;

import guia07ejercicio04.Entidad.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author LuiG
 */
public class Guia07Ejercicio04Main {
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Rectangulo rectanguloUno = new Rectangulo();
        System.out.println("ingrese la altura");
        rectanguloUno.setAltura(leer.nextInt());
        System.out.println("ingrese la base");
        rectanguloUno.setBase(leer.nextInt());
        
        rectanguloUno.perimetroRectangulo();
        rectanguloUno.superficieRectangulo();
        
        rectanguloUno.dibujarRectangulo();
        // TODO code application logic here
    }
    
}
