/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetedos;

/**
 *
 * @author USUARIO
 */
public class EquipoCelular {

    private String sistema;
    private String pantalla;
    private String direccion;
    private String imei;
    private double costoInicial;
    private double porcentaje;
    private double ivaInicial;
    private double costoFinal;

    public void establecerSistema(String c) {
        sistema = c;
    }

    public void establecerPantalla(String c) {
        pantalla = c;
    }

    public void establecerDireccion(String c) {
        direccion = c;
    }

    public void establecerImei(String c) {
        imei = c;
    }

    public void establecerCostoInicial(double c) {
        costoInicial = c;
    }

    public void establecerPorcentaje(double c) {
        porcentaje = c;
    }

    public void calcularIvaCostoInicial() {
        ivaInicial = costoInicial * (porcentaje / 100);
    }

    public void calcularCostoFinal() {
        costoFinal = ivaInicial + costoInicial;
    }

    public String obtenerSistema() {
        return sistema;
    }

    public String obtenerPantalla() {
        return pantalla;
    }

    public String obtenerDireccion() {
        return direccion;
    }

    public String obtenerImei() {
        return imei;
    }

    public double obtenerCostoInicial() {
        return costoInicial;
    }

    public double obtenerPorcentaje() {
        return porcentaje;
    }

    public double obtenerIvaCostoInicial() {
        return ivaInicial;
    }

    public double obtenerCostoFinal() {
        return costoFinal;
    }
}
