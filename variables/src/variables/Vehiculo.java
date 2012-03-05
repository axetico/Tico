/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package variables;

/**
 *
 * @author Administrador
 */
public class Vehiculo {
    protected String color; //private: implica que no se puede llamar o no se pueden modificar sus valores de otra clase
    protected int ruedas;
    protected int puertas; //private:implica este tipo de propiedada no va poder ser accedida de otra clase ni heredara
    protected String patente;//protected:que no va poder ser acceddida de otra clase pero si va poder heredara
    
    public Vehiculo (String color, int ruedas, int puertas){
        this.color = color;
        this.ruedas = ruedas;
        this.puertas = puertas;
        
    }
    public Vehiculo() { //publica: accesada de cualquier lado y hererado
        this.color = "verde";
        this.ruedas = 4;
        this.puertas = 5;
    }
    public int obtenerRuedas(){
        return ruedas;
    }
    public int obtenerPuertas(){
        return puertas;
    }
    public String obtenerColor () {
        return color;
    }
    
}
