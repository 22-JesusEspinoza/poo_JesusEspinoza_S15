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
public class estudiante_08 {
    
    String nombre;
    int edad;
    String accion;
    String curso;

    estudiante_08(String juan_Pérez, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



    public void saludar() {
        System.out.println("Hola, soy el estudiante " + nombre + " y tengo " + edad + " años.");
    }
    public void curso() {
        System.out.println("Estoy " + accion + " y ando en el curso de " + curso );
    }
}
