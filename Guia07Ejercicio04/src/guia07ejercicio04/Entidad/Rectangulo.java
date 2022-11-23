/*
 Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
base y un atributo privado altura. 
La clase incluirá un método para crear el rectángulo con
los datos del Rectángulo dados por el usuario. 
También incluirá un método para calcular la
superficie del rectángulo y un método para calcular el perímetro del rectángulo. 
Por último,
tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la
altura. Se deberán además definir los métodos getters, setters y constructores
correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
package guia07ejercicio04.Entidad;

/**
 *
 * @author LuiG
 */
public class Rectangulo {
    
    private int base;
    private int altura;

    public Rectangulo() {
    }
    

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    
    public void superficieRectangulo(){
        
        int superficie;
        superficie= this.altura*this.base;
        System.out.println("la superficie del rectangulo es "+superficie);
    
    }
    
    public void perimetroRectangulo(){
        int perimetro;
        perimetro= 2*(this.base*this.altura);
        System.out.println("el perimetro del rectangulo es "+ perimetro);
    }
    
    
    public void dibujarRectangulo(){
        String aux="";
        for (int i = 0; i < this.altura ;i++) {
            for (int j = 0; j < this.base; j++) {
                if(i==0 || i==(this.altura-1)){
                    aux+="*";
    
                }else if (j==0 || j==(this.base-1)){
                    aux+="*";
                        
                }else{
                    aux+=" ";
                }
  
            }
            System.out.println(aux);
            aux="";
        }
    }
    
}
