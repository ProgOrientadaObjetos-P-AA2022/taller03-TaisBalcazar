/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetedos;

/**
 *
 * @author TaisBalcazar
 */
public class Terreno {

    private double costoTerreno;
    private double ancho;
    private double largo;
    private double area;
    private double valorMetroCuadrado;
    

    public void establecerAncho(double c) {
        ancho = c;
    }

    public void establecerLargo(double c) {
        largo = c;
    }
    public void calcularValorArea() {
        area = ancho * largo;
    }
    
    public void establecerValorMetroCuadrado(double c) {
        valorMetroCuadrado = c;
    }
    
    public void calcularCostoTerreno() {
        costoTerreno = area * valorMetroCuadrado;
    }
    


    public double obtenerAncho() {
        return ancho;
    }

    public double obtenerLargo() {
        return largo;
    }

    public double obtenerArea() {
        return area;
    }

    public double obtenerValorMetroCuadrado() {
        return valorMetroCuadrado;
    }

    public double obtenerCostoTerreno() {
        return costoTerreno;
    }
    
}
