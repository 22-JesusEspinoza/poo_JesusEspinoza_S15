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
public class Libro_08 {
    
    String titulo;
    String autor;
    int año;
    String pais;

    Libro_08(String el_Gran_Gatsby, String f_Scott_Fitzgerald) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



    public void mostrarInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
    }
    public void año() {
        System.out.println("Fue purblicado en el año " + año);
        System.out.println("Fue publicado en el pais de " + pais);
    }
}

