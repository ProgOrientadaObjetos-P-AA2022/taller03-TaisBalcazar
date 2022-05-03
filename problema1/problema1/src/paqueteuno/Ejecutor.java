/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paqueteuno;

import paquetedos.Terreno;

/**
 *
 * @author TaisBalcazar
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Terreno terreno = new Terreno();
        Terreno terreno2 = new Terreno();

        double ancho = 15.7;
        double largo = 30.5;
        double valorMetroCuadrado = 5.40;

        double ancho2 = 10.7;
        double largo2 = 20.5;
        double valorMetroCuadrado2 = 3.40;

        terreno.establecerAncho(ancho);
        terreno.establecerLargo(largo);
        terreno.establecerValorMetroCuadrado(valorMetroCuadrado);
        terreno.calcularValorArea();
        terreno.calcularCostoTerreno();

        terreno2.establecerAncho(ancho2);
        terreno2.establecerLargo(largo2);
        terreno2.establecerValorMetroCuadrado(valorMetroCuadrado2);
        terreno2.calcularValorArea();
        terreno2.calcularCostoTerreno();

        System.out.printf("Terreno 1\nAncho: %.2f\n"
                + "Largo: %.2f\nValor Metro Cuadrado: %.2f\n"
                + "Area: %.2f\nCosto del terreno: %.2f\n"
                + "\nTerreno 2\nAncho: %.2f\n"
                + "Largo: %.2f\nValor Metro Cuadrado: %.2f\n"
                + "Area: %.2f\nCosto del terreno: %.2f\n", terreno.obtenerAncho(),
                terreno.obtenerLargo(), terreno.obtenerValorMetroCuadrado(),
                terreno.obtenerArea(), terreno.obtenerCostoTerreno(),
                terreno2.obtenerAncho(), terreno2.obtenerLargo(),
                terreno2.obtenerValorMetroCuadrado(), terreno2.obtenerArea(),
                terreno2.obtenerCostoTerreno());
    }

}
