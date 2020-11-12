/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica5;

/**
 *Esta es la clase Circulo que se utilizó en la practica 5
 * @author Miguel
 */
public class Circulo {
    static double PI = Math.PI;
    private double radio;
    private String color;
    boolean toString;

    public Circulo() {
    }
    /**
     * 
     * @param radio recibe radio de tipo double
     */
    public Circulo(double radio) {
        this.radio = radio;
    }
    /**
     * 
     * @return radio Retorna el radio
     */
    public double getRadio() {
        return radio;
    }
    /**
     * 
     * @param radio Recibe un numero que sera el radio
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }
    /**
     * 
     * @return retorna todos los atributos
     */
    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + ", color=" + color + '}';
    }
    /**
     * 
     * @return perimetro Retorna el perimetro 
     */
    public double perimetro(){
        return 2*PI*radio;
    }
    /**
     * 
     * @return area Retorna el area
     */
    public double area(){
        return 2*PI*radio*radio;
    }

   
   
    
    
    
}
