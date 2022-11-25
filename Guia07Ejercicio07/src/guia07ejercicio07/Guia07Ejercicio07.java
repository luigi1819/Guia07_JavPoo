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
       
        
        UiMenu.menuPersona();
        
        
       
        
        
        
    }
    
}
