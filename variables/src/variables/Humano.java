/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package variables;

/**
 *
 * @author Administrador
 */
public class Humano {
    private int edad; //atributos
    private int peso; //atributos
    private int altura; //atributos
    private String nombre; //atributos
    
    public Humano (int edad, int peso, int altura, String nombre){ //constructor
        this.edad = edad; //este la propiedad edad va ser igual a la variable edad
        this.peso = peso;
        this.altura = altura;
        this.nombre = nombre;
        
    }
    public void asignarEdad(int edad){
        this.edad = edad;
    }

  
public int obtenerEdad (){
    return edad;
}
public int obtenerPeso (){
    return peso;
}
public int obtenerAltura (){
    return altura;
}
public String obtenerNombre (){
    return nombre;
}
    
    
}
