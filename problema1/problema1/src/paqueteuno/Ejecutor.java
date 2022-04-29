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

        double ancho = 15.7;
        double largo = 30.5;
        double valorMetroCuadrado = 5.40;

        terreno.establecerAncho(ancho);
        terreno.establecerLargo(largo);
        terreno.establecerValorMetroCuadrado(valorMetroCuadrado);

        terreno.calcularValorArea();
        terreno.calcularCostoTerreno();

        System.out.printf("Ancho: %.2f\n"
                + "Largo: %.2f\nValor Metro Cuadrado: %.2f\n"
                + "Area: %.2f\nCosto del terreno: %.2f\n", terreno.obtenerAncho(),
                terreno.obtenerLargo(), terreno.obtenerValorMetroCuadrado(),
                terreno.obtenerArea(), terreno.obtenerCostoTerreno());
    }

}
