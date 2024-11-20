/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop;

/**
 *
 * @author pge6971
 */
public class Estudiante {
    //Atributos
    public String nom;
    public String dni;
    public int edad;
    public String curs;
    
    //Constructores
    /**
     * Constructor d ela clase Estudiante
     */
    
    public Estudiante(){
        //para distgir que hablamos de atributos llamamos this.blabla
        this.nom = "hola";
        this.dni = "0921093209390";
        this.edad = 9;
        this.curs = "DAW-B";
    }
    
    
   /**
    * 
    * @param nom
    * @param dni
    * @param edad
    * @param curs 
    */
    public Estudiante(String nom, String dni, int edad, String curs){
        //para distgir que hablamos de atributos llamamos this.blabla
        this.nom = nom;
        this.dni = dni;
        this.edad = edad;
        this.curs = curs;
    }
    
    // Metodos
    /**
     * Mustra con un formato amigable y blablabla
     */
    
    public void informe(){
        System.out.println("Nom: " + nom);
        System.out.println("DNI: " + dni);
        System.out.println("EDAD: " + edad);
        System.out.println("Curs: " + curs);
    }
    
    /**
     * permite cambiat con el parametre curso
     * @param curso 
     */
    public void cambiarDeCurso(String curs){
        this.curs = curs;
    }

    
}
