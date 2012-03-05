/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package variables;

/**
 *
 * @author Administrador
 */
public class clasesyobjetos {
    public static void main (String [] args){
        Humano obj_h = new Humano (20,10,5,"pancho");
        System.out.println("mi nombre es: " + obj_h.obtenerNombre());
        System.out.println("mi peso es: " + obj_h.obtenerPeso());
        System.out.println("mi altura es: " + obj_h.obtenerAltura());
        System.out.println("mi edad es: " + obj_h.obtenerEdad());
        obj_h.asignarEdad(45);
        System.out.println("Mi edad es . " + obj_h.obtenerEdad());
    }
    
}
