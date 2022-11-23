package guia07ejercicio03.Entidades;

import java.util.Scanner;

/*
 Crear una clase llamada Operacion que tenga como atributos privados numero1 y
numero2. A continuación, se deben crear los siguientes métodos:
a) Método constructor con todos los atributos pasados por parámetro.
b) Metodo constructor sin los atributos pasados por parámetro.
c) Métodos get y set.
d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda en
los atributos del objeto.
e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
f) Método restar(): calcular la resta de los números y devolver el resultado al main
g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si
fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error. Si
no, se hace la multiplicación y se devuelve el resultado al main
h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar
una división por cero, el método devuelve 0 y se le informa al usuario el error se le
informa al usuario. Si no, se hace la división y se devuelve el resultado al main.
 *

/**
 *
 * @author LuiG
 */
public class Operacion {
    
    private int numero1;
    private int numero2;
    
    public static Scanner leer = new Scanner(System.in);
    
    
    
    public Operacion() {
    }

    
    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    
    //metodos
    
    public void crearOperacion(){
        
        System.out.println("Ingresa un Numero");
        this.numero1 = leer.nextInt();
        System.out.println("Ingresa un Segundo Numero");
        this.numero2 = leer.nextInt();
        
    }
    
    public void sumar(){
        int total;
        total = this.numero1+this.numero2;
        
        System.out.println("el total de la suma de los numeros es "+ total);
    }
    
    public void restar(){
        int total;
        total = this.numero1-this.numero2;
        System.out.println("la resta de los numeros es "+ total);
    }
    //cuando usar this y cuando no
    public void multiplicar(){
        int total;
        if(this.numero1==0||this.numero2==0){
            System.out.println("error la multiplicacion por 0 es 0");
        }else{
           total = numero1*numero2;
           
            System.out.println("el restultado de la multiplicacion es "+ total);
        
        }
    
    
    }
     public void dividir(){
        double total;
        if(this.numero1 == 0 || this.numero2 == 0){
            System.out.println("la divison por 0 siempre es 0 ");
        }else{
            total = (double) this.numero1/this.numero2;
            System.out.println("la divison de los numeros es "+ total);
        }
    
    }
        
       

    @Override
    public String toString() {
        return "Operacion{" + "numero1=" + numero1 + ", numero2=" + numero2 + '}';
    }
    
    
    
}
