/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package variables;

/**
 *
 * @author Administrador
 */
public class Vectores {
    
    public static void main (String[] args) {
        int a[] = new int[5];
        a[0] = 1;
        a[1] = 5;
        a[2] = 6;
        a[3] = 10;
        a[4] = 14;
       // System.out.println(a[2]);
        obtenerNum(a,3);
    }
    public static void obtenerNum(int v[], int p){ //el void sirve para no devuelva nada
      System.out.println(v[p]);  
    }
}
