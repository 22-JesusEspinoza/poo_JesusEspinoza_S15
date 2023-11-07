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
public class fruta_08 {
    
    String nombre;
    String tipo;
    String color;
    String sabor;
    double precioPorKilo;


    public void pelar() {
        System.out.println("Se ha pelado la fruta " + nombre);
    }

    public void cortar() {
        System.out.println("Se ha cortado la fruta " + nombre);
    }

    public void exprimir() {
        System.out.println("Se ha exprimido la fruta " + nombre);
    }

    public void cambiarColor(String nuevoColor) {
        color = nuevoColor;
        System.out.println("El color de la fruta " + nombre + " ha cambiado a " + nuevoColor);
    }

    public double obtenerPrecioPorKilo() {
        return precioPorKilo;
    }
}

