/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica5;

/**
 *Esta es la clase Fecha que se utilizó en la practica 5
 * @author Miguel
 */
class Fecha {
    private int dia;
    private int mes;
    private int anio;

    public Fecha() {
    }
    /**
     * 
     * @param dia recibe un numero que sera el dia tipo int
     * @param mes recibe un numero que sera el mes tipo int
     * @param anio recibe un numero que sera el año tipo int
     */
    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public int getDia() {
        return dia;
    }
    /**
     * 
     * @param dia parametro dia de tipo int 
     */
    public void setDia(int dia) {
        this.dia = dia;
    }
    /**
     * 
     * @return mes
     */
    public int getMes() {
        return mes;
    }
    /**
     * 
     * @param mes Parametro mes de tipo int
     */
    public void setMes(int mes) {
        this.mes = mes;
    }
    /**
     * 
     * @return anio
     */
    public int getAnio() {
        return anio;
    }
    /**
     * 
     * @param anio Año de tipo int
     */
    public void setAnio(int anio) {
        this.anio = anio;
    }
    /**
     * 
     * @return muestra los atributos
     */
    @Override
    public String toString() {
        return "Fecha{" + "dia=" + dia + ", mes=" + mes + ", anio=" + anio + '}';
    }
    
    
}
