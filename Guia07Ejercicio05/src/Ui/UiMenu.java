/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ui;

import guia07ejercicio05.Entidade.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author LuiG
 */
public class UiMenu {
    
    
    public static void showMenu(){
        Scanner leer = new Scanner(System.in);
        System.out.println("selecciona la opcion deseada");
        int seleccion = 0;

        
         CuentaBancaria cuentaUno = new CuentaBancaria();
        
       
        
        
        
         do {
            System.out.println("1. crear Cuenta");
            System.out.println("2. Ingresar saldo");
            System.out.println("3. Retirar Saldo");
            System.out.println("4. Extracion Rapida ");
            System.out.println("5. Consultar Datos Cuenta");
            System.out.println("6. Consultar saldo");
            System.out.println("0. Ingresar saldo");
            seleccion = leer.nextInt();
                switch(seleccion){

                    case 1:
                        cuentaUno.crearCuenta();
                        break;
                   case 2:
                        cuentaUno.ingresarIngreso();
                        break;
                   case 3:
                        cuentaUno.retirarSaldo();
                        break;     
                   case 4:
                        cuentaUno.extracionRapida(); 
                        break;
                   case 5:
                        cuentaUno.consultarDatos();
                        break;
                   case 6:
                        cuentaUno.consultarSaldo();
                        break;
                   case 0:
                       System.out.println("adios");

                }
                 System.out.println("------------------------------");
             
        } while (seleccion != 0);
    
    
    
    }
    
}
