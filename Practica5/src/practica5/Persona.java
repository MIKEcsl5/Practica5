/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica5;

/**
 *Esta es la clase Persona que se utilizó en la practica 5
 * @author Miguel
 */
public class Persona {
    private String Nombre;
    private String Apellidos;
    private Fecha fNacimiento;

    public Persona() {
    }
    /**
     * 
     * @param Nombre Es el nombre de nuestra persona
     * @param Apellidos Es el apellido de nuestra persona
     * @param fNacimiento Es la fecha de nacimiento de nuestra persona
     */
    public Persona(String Nombre, String Apellidos, Fecha fNacimiento) {
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.fNacimiento = fNacimiento;
    }
    /**
     * 
     * @param Nombre Es el nombre de la nuestra persona de tipo string
     * @param Apellidos Es el apellido de nuestra persona de tipo string
     */
    public Persona(String Nombre, String Apellidos) {
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.fNacimiento = new Fecha(3,5,2000);
    }
    /**
     * 
     * @return retorna el nombre de tipo string
     */
    public String getNombre() {
        return Nombre;
    }
    /**
     * 
     * @param Nombre parametro nombre de tipo string
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    /**
     * 
     * @return retorna los apellidos de tipo string
     */
    public String getApellidos() {
        return Apellidos;
    }
    /**
     * 
     * @param Apellidos recibe apellidos de tipo string
     */
    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }
    /**
     * 
     * @return fNacimiento de tipo Fecha
     */
    public Fecha getfNacimiento() {
        return fNacimiento;
    }
    /**
     * 
     * @param fNacimiento Param fNacimiento de tipo fecha
     */
    public void setfNacimiento(Fecha fNacimiento) {
        this.fNacimiento = fNacimiento;
    }
    /**
     * 
     * @return muestra los atributos de la clase
     */
    @Override
    public String toString() {
        return "Persona{" + "Nombre=" + Nombre + ", Apellidos=" + Apellidos + ", fNacimiento=" + fNacimiento + '}';
    }

}

    