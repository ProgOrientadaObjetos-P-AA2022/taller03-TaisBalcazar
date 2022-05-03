/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paqueteuno;

import paquetedos.EquipoCelular;

/**
 *
 * @author USUARIO
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EquipoCelular equipo1 = new EquipoCelular();
        EquipoCelular equipo2 = new EquipoCelular();
        // Variables
        String sistema1 = "Android";
        String pantalla1 = "25cm";
        double costoInicial1 = 500;
        double porcentaje1 = 12;
        String direccion1 = "1.0.346.3453";
        String imei1 = "989527954918527";

        String sistema2 = "iOS";
        String pantalla2 = "27cm";
        double costoInicial2 = 900;
        double porcentaje2 = 15;
        String direccion2 = "1.0.678.4634";
        String imei2 = "300124214777612";
        // Metodos
        equipo1.establecerSistema(sistema1);
        equipo1.establecerPantalla(pantalla1);
        equipo1.establecerCostoInicial(costoInicial1);
        equipo1.establecerPorcentaje(porcentaje1);
        equipo1.establecerDireccion(direccion1);
        equipo1.establecerImei(imei1);
        equipo1.calcularIvaCostoInicial();
        equipo1.calcularCostoFinal();

        equipo2.establecerSistema(sistema2);
        equipo2.establecerPantalla(pantalla2);
        equipo2.establecerCostoInicial(costoInicial2);
        equipo2.establecerPorcentaje(porcentaje2);
        equipo2.establecerDireccion(direccion2);
        equipo2.establecerImei(imei2);
        equipo2.calcularIvaCostoInicial();
        equipo2.calcularCostoFinal();
        //Obtener
        System.out.printf("Equipos Celular 1\n\nEquipo Celular Uno\n"
                + "Sistema Operativo: %s\nPantalla: %s\nCosto Inicial: %.2f\n"
                + "Porcentaje IVA: %.1f\nIVA Resultante: %.2f\nDirección Mac: "
                + "%s\nInformación IMEI: %s\nCosto Final: $%.2f\n"
                + "\nEquipo Celular 2\n"
                + "Sistema Operativo: %s\nPantalla: %s\nCosto Inicial: %.2f\n"
                + "Porcentaje IVA: %.1f\nIVA Resultante: %.2f\nDirección Mac: "
                + "%s\nInformación IMEI: %s\nCosto Final: $%.2f\n",
                equipo1.obtenerSistema(),
                equipo1.obtenerPantalla(),
                equipo1.obtenerCostoInicial(),
                equipo1.obtenerPorcentaje(),
                equipo1.obtenerIvaCostoInicial(),
                equipo1.obtenerDireccion(),
                equipo1.obtenerImei(),
                equipo1.obtenerCostoFinal(),
                equipo2.obtenerSistema(),
                equipo2.obtenerPantalla(),
                equipo2.obtenerCostoInicial(),
                equipo2.obtenerPorcentaje(),
                equipo2.obtenerIvaCostoInicial(),
                equipo2.obtenerDireccion(),
                equipo2.obtenerImei(),
                equipo2.obtenerCostoFinal());
    }
}
