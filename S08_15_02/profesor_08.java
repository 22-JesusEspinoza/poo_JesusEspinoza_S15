/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S08_15_02;

import java.util.List;
/**
 *
 * @author Lab20
 */
public class profesor_08 {
    
    String nombre;
    int edad;
    String especialidad;
    double salario;
    List<String> cursosDictados;


    public void enseñar(String clase) {
       
        System.out.println(nombre + " está enseñando la clase de " + clase);
    }

    public void aumentarSalario(double aumento) {
        salario += aumento;
        System.out.println("El salario de " + nombre + " ha aumentado a " + salario);
    }

    public void agregarCurso(String curso) {
        cursosDictados.add(curso);
        System.out.println(nombre + " ha empezado a dictar el curso de " + curso);
    }

    public int obtenerEdad() {
        return edad;
    }

    public void cambiarEspecialidad(String nuevaEspecialidad) {
        especialidad = nuevaEspecialidad;
        System.out.println(nombre + " ha cambiado su especialidad a " + nuevaEspecialidad);
    }
}

