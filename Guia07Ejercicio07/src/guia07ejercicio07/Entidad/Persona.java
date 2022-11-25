/*
 Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad, sexo
('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún otro
atributo, puede hacerlo. Los métodos que se implementarán son:
? Un constructor por defecto.
? Un constructor con todos los atributos como parámetro.
? Métodos getters y setters de cada atributo.
? Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al
usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o O.
Si no es correcto se deberá mostrar un mensaje



? Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa
que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la
fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona
está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la
fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.
? Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve
un booleano. 


A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal, tiene
sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la persona es
mayor de edad.

Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
distintas variables, para después en el main, calcular un porcentaje de esas 4 personas
cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores.
 */
package guia07ejercicio07.Entidad;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author LuiG
 */
public class Persona {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    
    
    private String nombre;
    private int edad;
    private String sexo;
    private int peso;
    private double altura;
    private int imc;
    private boolean mayorEdad;
    
    
    // constructores

    public Persona() {
    }

    public Persona(String nombre, int edad, int peso, int altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
    }
    
    // geters and setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    // metodos
    
    
    public void crearPersona(){
        System.out.println("ingresa el nombre");
        this.nombre = leer.next();
        System.out.println("ingresa la edad");
        this.edad = leer.nextInt();
        
        do {
            System.out.println("ingresa H para varon o M para mujer indicar tu sexo");
            this.sexo= leer.next();
            
        } while (this.sexo.equalsIgnoreCase("h") !=  true && this.sexo.equalsIgnoreCase("m") !=  true);
           
        System.out.println("ingresa el peso");
        this.peso = leer.nextInt();
        
        do {
            System.out.println("ingresa la altura valor en metros ejm 1.70");
            this.altura = leer.nextDouble();
            
        } while(this.altura>2 || this.altura<0);
        
        
    }
    
    public int calcularIMC(){
      
      
      double imc;
      imc = (double) peso/ Math.pow(altura, altura);
      
      if(imc<20){
          System.out.println("persona por debajo del peso ideal");
          this.imc = -1;
      }else if(imc<=25 && imc >=20){
          System.out.println("persona esta en su peso ideal");
          this.imc = 0;
      }else{
          System.out.println("persona con sobrepeso");
          this.imc = 1;
      }
        
      return this.imc;
    }
    
    public boolean mayorEdad(){
        
        boolean mayorEdad;
        
        if( this.edad < 18 ){
            System.out.println("es menor de edad");
            mayorEdad=false;
        }else{
            System.out.println("es mayor de edad");
            mayorEdad=true;
            
        }
        this.mayorEdad=mayorEdad;
        
        return this.mayorEdad;
    
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", peso=" + peso + ", altura=" + altura + ", imc=" + imc + ", mayorEdad=" + mayorEdad + '}';
    }

    
    
    
    
    
    
}
