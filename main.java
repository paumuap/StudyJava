/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuadrado;

/**
 *
 * @author pge6971
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cuadrado cuadrado1 = new Cuadrado(9.1);
        Cuadrado cuadrado2 = new Cuadrado(4.3);
        
        cuadrado1.info();
        cuadrado2.info();
        double a1 = cuadrado1.calculArea(9.1);
        double a2 = cuadrado2.calculArea(4.3);
        double suma = a1 + a2;
        System.out.println("Suma de areas de dos cuadrados: " + suma);
        
        
    }
    
}
