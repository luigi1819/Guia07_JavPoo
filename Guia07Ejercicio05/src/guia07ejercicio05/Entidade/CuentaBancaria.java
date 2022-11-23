/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia07ejercicio05.Entidade;

import java.util.Scanner;

/**
 *
 * @author LuiG
 */
public class CuentaBancaria {
    
    Scanner leer = new Scanner(System.in);
    
    private int numeroCuenta;
    private long dniCliente;
    private int saldoCuenta;

    public CuentaBancaria() {
    }

    public CuentaBancaria(int numeroCuenta, long dniCliente, int saldoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.dniCliente = dniCliente;
        this.saldoCuenta = saldoCuenta;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(long dniCliente) {
        this.dniCliente = dniCliente;
    }

    public int getSaldoCuenta() {
        return saldoCuenta;
    }

    public void setSaldoCuenta(int saldoCuenta) {
        this.saldoCuenta = saldoCuenta;
    }
    
    //
    public void crearCuenta(){
    
        System.out.println("para crear una cuenta ingresa tu dni");
        this.dniCliente = leer.nextInt();
        System.out.println("Ingresa tu numero de cuenta");
        this.numeroCuenta = leer.nextInt();
        System.out.println("ingresa el saldo de tu cuenta");
        this.saldoCuenta = leer.nextInt();
    
    }
    
    public void ingresarIngreso(){
        int saldoAgregar;
        System.out.println("ingresa el monto a ingresar");
        saldoAgregar= leer.nextInt();
        this.saldoCuenta+= saldoAgregar;
        System.out.println("su nuevo saldo es "+ this.saldoCuenta);
    
    }
    
    public void retirarSaldo(){
        int retirarSaldo;
        
        System.out.println("ingresa el saldo que deseas retirar");
        retirarSaldo = leer.nextInt();
        if(retirarSaldo>this.saldoCuenta){
            System.out.println("su saldo se pondra en 0 por que el programa asi lo dice");
            this.saldoCuenta=0;
        }else{
            this.saldoCuenta-= retirarSaldo;
            System.out.println("su nuevo saldo es "+ this.saldoCuenta);
        }  
        
    }
    public void extracionRapida(){
        double cantMaxExtra;
        double cantRetirar=0;
        cantMaxExtra=0.20*this.saldoCuenta;
        System.out.println("la cantidad maxima de extracion es "+ cantMaxExtra);
        System.out.println("ingresa la cantidad a retirar");
        do {
            cantRetirar=leer.nextDouble();
            if(cantRetirar>cantMaxExtra){
                System.out.println("la cantidad a retirar es mayor al saldo");
                System.out.println("ingresa una nueva cantidad");
                
            }else{
                this.saldoCuenta-=cantRetirar;
            
            }
            
        } while (cantRetirar>cantMaxExtra);
        
        
        
    
    }
    
    public void consultarSaldo(){
        
        System.out.println("su saldo actual es "+this.saldoCuenta);
        
        
    }
    public void consultarDatos(){
    
        System.out.println("El Dni de la cuenta es "+this.dniCliente);
        System.out.println("El saldo de la cuenta es "+ this.saldoCuenta);
        System.out.println("El numero de la cuenta "+this.numeroCuenta);
    }
    @Override
    public String toString() {
        return "CuentaBancaria{" + "numeroCuenta=" + numeroCuenta + ", dniCliente=" + dniCliente + ", saldoCuenta=" + saldoCuenta + '}';
    }

    
    
    
    
    
}
