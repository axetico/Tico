/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


package variables;
import java.util.*;

/**
 *
 * @author Administrador
 */
public class Metodos {
    public static void main (String [] args) {
        Scanner s = new Scanner (System.in);
        String input = s.nextLine();
        int a = Integer.parseInt(input);
        input = s.nextLine();
        int b = Integer.parseInt(input);
        System.out.println (sumar(a,b));
    }
    public static int sumar (int a , int b){
        return (a+b);
    }
}
