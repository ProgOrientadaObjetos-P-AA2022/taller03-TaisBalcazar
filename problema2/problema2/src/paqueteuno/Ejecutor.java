/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paqueteuno;

import paquetedos.EquivalenteHora;

/**
 *
 * @author UTPL
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        EquivalenteHora equivalente = new EquivalenteHora();
        EquivalenteHora equivalente1 = new EquivalenteHora();

        double horauno = 48;
        double horados = 24;

        equivalente.establecerHoras(horauno);
        equivalente.calcularDias();
        equivalente.calcularMinutos();
        equivalente.calcularSegundos();

        equivalente1.establecerHoras(horados);
        equivalente1.calcularDias();
        equivalente1.calcularMinutos();
        equivalente1.calcularSegundos();

        System.out.printf("Equivalencias 1\nHoras: %.2f\n"
                + "Dias: %.2f\nMinutos: %.2f\nSegundos: %.2f\n"
                + "\nEquivalencias 2\nHoras: %.2f\nDias: %.2f\nMinutos: %.2f\n"
                + "Segundos: %.2f\n",
                equivalente.obtenerHoras(), equivalente.obtenerDias(), 
                equivalente.obtenerMinutos(), equivalente.obtenerSegundos(),
                equivalente1.obtenerHoras(), equivalente1.obtenerDias(),
                equivalente1.obtenerMinutos(), equivalente1.obtenerSegundos());
    }

}
