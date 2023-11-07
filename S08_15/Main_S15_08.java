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
public class Main_S15_08 {

    
    public static void main(String[] args) {
       
       
        estudiante_08 estudiante1 = new estudiante_08("Juan Pérez", 30);
        estudiante1.saludar();
        estudiante_08 estudiante2 = new estudiante_08("estudiando", 10);
        estudiante2.curso();

    
        Libro_08 libro1 = new Libro_08("El Gran Gatsby", "F. Scott Fitzgerald");
        libro1.mostrarInfo();
        Libro_08 libro2 = new Libro_08("1990", "Alemania");
        libro2.año();

     
        Coche_08 coche1 = new Coche_08("Toyota", "Corolla");
        coche1.mostrarInfo();
        Coche_08 coche2 = new Coche_08("1880", "España");
        coche2.pais();

        

    }
}

