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
public class Main_S15_08_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        profesor_08 profesor = new profesor_08();
        profesor.enseñar("Álgebra");
        profesor.aumentarSalario(5000);
        profesor.agregarCurso("Cálculo");
        System.out.println("Edad del profesor: " + profesor.obtenerEdad());
        profesor.cambiarEspecialidad("Física");

        carro_08 carro = new carro_08();
        carro.arrancar();
        carro.acelerar(80);
        carro.frenar();
        System.out.println("Precio del carro: " + carro.obtenerPrecio());

        fruta_08 fruta = new fruta_08();
        fruta.pelar();
        fruta.cambiarColor("Verde");
        System.out.println("Precio por kilo de la fruta: " + fruta.obtenerPrecioPorKilo());

        bombero_08 bombero = new bombero_08();
        bombero.apagarIncendio();
        bombero.rescatarPersona();
        bombero.promover("Teniente");
        System.out.println("Experiencia del bombero: " + bombero.obtenerExperiencia());
    }
    }
    

