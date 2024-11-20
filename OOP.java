/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oop;

/**
 *
 * @author pge6971
 */
public class OOP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Estudiante estudiante1 = new Estudiante("Au", "989898", 24, "DAC");
        Estudiante estudiante2 = new Estudiante("JO", "789676", 39, "FOL");
        
        System.out.println("Sin csmbios");
        estudiante1.informe();
        estudiante2.informe();
        
        estudiante1.cambiarDeCurso("PAM");
        estudiante2.cambiarDeCurso("BLABLA");
        System.out.println("Con cambios");
        
        estudiante1.informe();
        estudiante2.informe();
    }
    
}
