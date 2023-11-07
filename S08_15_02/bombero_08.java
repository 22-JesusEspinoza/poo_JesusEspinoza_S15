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
public class bombero_08 {

    String nombre;
    int año;
    String rango;
    String estación;
    int experiencia;

    


    public void apagarIncendio() {
        System.out.println(nombre + " apago un incendio hace ." + año + "años");
    }

    public void rescatarPersona() {
        System.out.println(nombre + " está rescatando a una persona en peligro.");
    }

    public void promover(String nuevoRango) {
        rango = nuevoRango;
        System.out.println(nombre + " ha sido promovido a " + nuevoRango);
    }

    public int obtenerExperiencia() {
        return experiencia;
    }
}
  
