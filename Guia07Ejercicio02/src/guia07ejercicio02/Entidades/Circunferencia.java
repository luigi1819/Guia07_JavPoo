/*
 Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la circunferencia (𝐀𝐫𝐞𝐚 = 𝛑 ∗ 𝐫𝐚𝐝𝐢𝐨𝟐).
e) Método perimetro(): para calcular el perímetro (𝐏𝐞𝐫𝐢𝐦𝐞𝐭𝐫𝐨 = 𝟐 ∗ 𝛑 ∗ 𝐫𝐚𝐝𝐢𝐨).
 */
package guia07ejercicio02.Entidades;

import java.util.Scanner;

/**
 *
 * @author LuiG
 * 
 
 */



public class Circunferencia {
    
     
    Scanner leer = new Scanner(System.in);
        
    private double radio;
  
    public Circunferencia() {
    }
    

    public Circunferencia(double radio) {
        this.radio = radio;
    }
    
    // geteres and seters

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    //metodo
    
    
    public void crearCircunferencia(Circunferencia circulo){
        
        
        System.out.println("inserta el radio del circulo");
        circulo.setRadio(leer.nextDouble());
        
        
        
    }
    
    public void area(Circunferencia circulo){
        
        double area;
        
        area = Math.PI * circulo.radio;
        
        System.out.println("el area del circulo es "+ area);
    
    }
    
  
    
    
    public void perimetro(Circunferencia circulo){
        
        double perimetro;
        
        perimetro= 2 * Math.PI * circulo.radio;
        
        
        System.out.println("el perimetro del circulo es "+ perimetro);
    
    
    }
    
    
    
}
