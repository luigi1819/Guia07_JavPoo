/*
 Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author LuiG
 */
public class Libro {
    private String ISBN;
    private String titulo;
    private String autor;
    private int numeroPags;
    
    

    public Libro() {
    }
    
    

    public Libro(String ISBN, String titulo, String autor, int numeroPags) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPags = numeroPags;
    }
    
    // getters and steers

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroPags() {
        return numeroPags;
    }

    public void setNumeroPags(int numeroPags) {
        this.numeroPags = numeroPags;
    }
    
    
   
    
    //metodos
    
    public void defInfoLibro(Libro libro){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa el ISB del libro");
        libro.setISBN(leer.nextLine());
        System.out.println("Ingresa el Titulo del libro");
        libro.setTitulo(leer.nextLine()); 
        System.out.println("Ingresa el autor del libro");
        libro.setAutor(leer.nextLine());
        System.out.println("Ingresa el Num Paginas del libro");
        libro.setNumeroPags(leer.nextInt()); 
        
        
    
    }
    
    
    public void mostrarLibro(Libro datos){
        System.out.println("el ISBN del libro es " + datos.getISBN());
        System.out.println("el Titulo del libro es " + datos.getTitulo());
        System.out.println("el Autor del libro es " + datos.getAutor());
        System.out.println("el NumeroPaginas del libro es " + datos.getNumeroPags());
       
        
        
    
    } 
    
    
    
    
}
