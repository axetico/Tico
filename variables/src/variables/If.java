/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package variables;

/**
 *
 * @author Administrador
 */
public class If {
    public static void main (String [] args ) {
        //int x = 3; //asignación
        //if (x==3);{
       /* if (x>3);{
        System.out.println("es el 3");
    }
        else 
        {
    System.out.println("no es el 3");
}
    }
    
} */
        int x =3;
        if(x<4){
            System.out.println("es menor que 4");
            
        }
        else if (x>4){
              System.out.println("es mayor que 4");
        }
        else {
              System.out.println("es  4");
        }
    switch (x) {
        case 0:
              System.out.println("es 0");
            break;
        case 1:
              System.out.println("es 1");
            break;
        case 2:
              System.out.println("es 2");
            break;
        case 3:
              System.out.println("es 3");
              break;
        default:
              System.out.println("es cualquier otro numero queno sea 0,1,2");
    }
    }}