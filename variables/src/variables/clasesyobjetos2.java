/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package variables;

/**
 *
 * @author Administrador
 */
public class clasesyobjetos2 {
    public static void main (String [] args ){
        Vehiculo v = new Vehiculo("rojo", 4,5);
        Vehiculo v2 = new Vehiculo ();
      /*  System.out.println("constructor con parametro");
        System.out.println("color: " + v.obtenerColor());
        System.out.println("puertas: " + v.obtenerPuertas());
        System.out.println("ruedas: " + v.obtenerRuedas());
        
          System.out.println("constructor sin parametro");
        System.out.println("color: " + v2.obtenerColor());
        System.out.println("puertas: " + v2.obtenerPuertas());
        System.out.println("ruedas: " + v2.obtenerRuedas());
        
    }
}*/
        Auto obj_a = new Auto ();
        System.out.println("color de auto: " + obj_a.obtenerColor());}}
