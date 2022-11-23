/*
 Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.
 */
package guia07ejercicio01;

import Entidades.Libro;


/**
 *
 * @author LuiG
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        
        Libro nuevo = new Libro();
        
        nuevo.defInfoLibro(nuevo);
        
        nuevo.mostrarLibro(nuevo);
        
        
        
        // TODO code application logic here
    }
    
}
