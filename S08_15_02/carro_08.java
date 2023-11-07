/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S08_15_02;

/**
 *
 * @author Lab20
 */
public class carro_08 {
    
    String marca;
    String modelo;
    int año;
    String color;
    double precio;

   

    

    public void arrancar() {
        System.out.println("El carro de marca " + marca + " ha arrancado.");
    }

    public void detener() {
        System.out.println("El carro de marca " + marca + " se ha detenido.");
    }

    public void acelerar(int velocidad) {
        System.out.println("El carro de marca " + marca + " ha acelerado a " + velocidad + " km/h.");
    }

    public void frenar() {
        System.out.println("El carro de marca " + marca + " ha frenado.");
    }

    public double obtenerPrecio() {
        return precio;
    }
}
