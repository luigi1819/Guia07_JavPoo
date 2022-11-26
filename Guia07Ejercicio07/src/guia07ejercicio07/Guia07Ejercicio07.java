/*
Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad, sexo
('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea a�adir alg�n otro
atributo, puede hacerlo. Los m�todos que se implementar�n son:
? Un constructor por defecto.
? Un constructor con todos los atributos como par�metro.
? M�todos getters y setters de cada atributo.
? Metodo crearPersona(): el m�todo crear persona, le pide los valores de los atributos al
usuario y despu�s se le asignan a sus respectivos atributos para llenar el objeto
Persona. Adem�s, comprueba que el sexo introducido sea correcto, es decir, H, M o O.
Si no es correcto se deber� mostrar un mensaje
? M�todo calcularIMC(): calculara si la persona est� en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta f�rmula da por resultado un valor menor que 20, significa
que la persona est� por debajo de su peso ideal y la funci�n devuelve un -1. Si la
f�rmula da por resultado un n�mero entre 20 y 25 (incluidos), significa que la persona
est� en su peso ideal y la funci�n devuelve un 0. Finalmente, si el resultado de la
f�rmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
funci�n devuelve un 1.
? M�todo esMayorDeEdad(): indica si la persona es mayor de edad. La funci�n devuelve
un booleano.
A continuaci�n, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuaci�n, llamaremos todos
los m�todos para cada objeto, deber� comprobar si la persona est� en su peso ideal, tiene
sobrepeso o est� por debajo de su peso ideal e indicar para cada objeto si la persona es
mayor de edad.
Por �ltimo, guardaremos los resultados de los m�todos calcularIMC y esMayorDeEdad en
distintas variables, para despu�s en el main, calcular un porcentaje de esas 4 personas
cuantas est�n por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
tambi�n calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores.
 */
package guia07ejercicio07;


import guia07ejercicio07.Entidad.Persona;
import guia07ejercicio07.UI.UiMenu;

/**
 *
 * @author LuiG
 */
public class Guia07Ejercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] vector = new int [3];
        int [] vector2 = new int [2];
        
        //UiMenu.menuPersona();
        Persona numeroUno = new Persona("luigi", 31, 54, 1.70);
        numeroUno.calcularIMC();
        numeroUno.mayorEdad();
         System.out.println(numeroUno);
         
        prePorcentajeImc(numeroUno, vector);
        prePorcentajeEdad(numeroUno, vector2);
        
       
        Persona numeroDos = new Persona("maria", 25, 34, 1.80);
        numeroDos.calcularIMC();
        numeroDos.mayorEdad();
         System.out.println(numeroDos);
         
        prePorcentajeImc(numeroDos, vector);
        prePorcentajeEdad(numeroDos, vector2); 
        
        Persona numeroTres = new Persona("pablo", 45, 61, 1.40);
        
        numeroTres.calcularIMC();
        numeroTres.mayorEdad();
         System.out.println(numeroTres);
       
        prePorcentajeImc(numeroTres, vector);
        prePorcentajeEdad(numeroTres, vector2); 
        
        Persona numeroCuatro = new Persona("carla", 17, 45, 1.47);
        numeroCuatro.calcularIMC();
        numeroCuatro.mayorEdad();
         System.out.println(numeroCuatro);
        
        prePorcentajeImc(numeroCuatro, vector);
        prePorcentajeEdad(numeroCuatro, vector2); 
        
        porcentajeImc(vector);
        porcentajeMayorEdad(vector2);
    }
    
    
    public static void prePorcentajeImc(Persona numeroUno,int [] vector){
         
         String valora;
         if(numeroUno.getImc()==-1){
             vector[0]++;
             
        
         }else if(numeroUno.getImc()==0){
              vector[1]++;
             
         }else{
              vector[2]++;

         }
         //valora = " personas por debajo el peso "+vector[0] + "\n personas peso ideal "+ vector[1] + "\n personas sobrepeso  "+ vector[2] ;
         //System.out.println(valora);
        
        }
    
    
     public static void porcentajeImc(int []vector){
     
         int total=0;
         double bajo=vector[0];
         double ideal=vector[1];
         double sobre=vector[2];
                 
         for (int i = 0; i < 3; i++) {
             total+= vector[i];
             
         }
         
         bajo = bajo*100 /total;
         ideal = ideal*100 /total;
         sobre = sobre*100 /total;
         
         System.out.println(" personas por debajo el peso "+bajo + "% \n personas peso ideal "+ ideal + "% \n personas sobrepeso  "+ sobre +"%"); 
                 
          
     
     }
    
     
     
     
     
     
     
    
     public static void prePorcentajeEdad(Persona numeroUno,int [] vector){
         
         String valora;
         if(numeroUno.mayorEdad()==true){
             vector[0]++;
             
         }else{
              vector[1]++;

         }
         //valora = " personas por debajo el peso "+vector[0] + "\n personas peso ideal "+ vector[1] + "\n personas sobrepeso  "+ vector[2] ;
         //System.out.println(valora);
        }
     
     public static void porcentajeMayorEdad(int [] vector2){
         int total=0;
         int mayorE=vector2[0];
         int menorE=vector2[1];
         for (int i = 0; i < 2; i++) {
             total+= vector2[i];
             
         }
         
         mayorE=mayorE*100/total;
         menorE=menorE*100/total;
         
         System.out.println(" personas mayores de edad "+mayorE + "% \n personas menores de edad "+ menorE + "%");

                 
         
     
     }
     
     
    
     
     
      
    
}
