/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica5;

/**
 *
 * @author Miguel
 */
public class Practica5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circulo c1 = new Circulo();
        Circulo c2 = new Circulo(6.0);
        
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        
        System.out.println("Perimetro c1 = "+c1.perimetro());
        System.out.println("Area del c1 = "+c1.area());
        
        System.out.println("Perimetro c2 = "+c2.perimetro());
        System.out.println("Area del c2 = "+c2.area());
        
        System.out.println("/******************/");
        c1.setRadio(9.0);
        System.out.println("Perimetro c1 = "+c1.perimetro());
        System.out.println("Area del c1 = "+c1.area());
        
        System.out.println("/******************/");
        Persona amigo = new Persona();
        Fecha fNaciemiento = new Fecha(3,4,2002);
        amigo.setNombre("Edgar");
        amigo.setApellidos("Romero Martinez");
        //System.out.println("info de mi amigo"+amigo.toString());
        System.out.println("info de mi amigo"+amigo);
        
        Persona amigo2 = new Persona("Raul", "Ayala Barbosa", new Fecha(20,4,1993));
        System.out.println("info Amigo 2"+amigo2);
        
        Persona amigo3 = new Persona("Diego", "Pedraza Peralta");
        System.out.println("info Amigo 3"+amigo3);
    }   
}