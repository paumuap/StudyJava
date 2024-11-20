/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuadrado;

/**
 *
 * @author pge6971
 */
public class Cuadrado {
    
    double lado;
    
    
    //Constructor
    public Cuadrado(double lado){
        this.lado = lado;
    }
    
    // Metodos
    
    public double calculArea(double lado){
        double area = lado*lado;
        return area;
    }
    
    public void info(){
        double area = calculArea(lado);
        System.out.println("Cuadrado del lado: " + area);
        System.out.println("Area: " + area);
    }
    
    
}
