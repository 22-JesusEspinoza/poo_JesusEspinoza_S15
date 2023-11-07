/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S08_15;

/**
 *
 * @author Lab20
 */
public class Coche_08 {
    
    String marca;
    String modelo;
    int año;
    String pais;

    Coche_08(String toyota, String corolla) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



    public void mostrarInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
    }
    public void pais() {
        System.out.println("El coche salio en el año " + año);
        System.out.println("y se creo en el Pais de " + pais);
    }
}
