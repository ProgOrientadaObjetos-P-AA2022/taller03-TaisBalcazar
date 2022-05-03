/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paqueteuno;

import paquetedos.Instituciones;

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

        Instituciones educativa1 = new Instituciones();
        Instituciones educativa2 = new Instituciones();

        //Variables - Objeto 1
        String nombre1 = "Daniel Alvarez Burneo";
        String tipo1 = "Publica";
        int alumnos1 = 3000;
        int docentes1 = 700;
        int sedes1 = 20;
        double gastos1 = 32354.50;

        //Variables - Objeto 2
        String nombre2 = "Eugenio Espejo";
        String tipo2 = "Privada";
        int alumnos2 = 1500;
        int docentes2 = 350;
        int sedes2 = 10;
        double gastos2 = 5454.50;

        //Metodos Objeto 1
        educativa1.establecerNombre(nombre1);
        educativa1.establecerTipo(tipo1);
        educativa1.establecerAlumnos(alumnos1);
        educativa1.establecerDocentes(docentes1);
        educativa1.establecerSedes(sedes1);
        educativa1.establecerGastos(gastos1);
        educativa1.calcularPresupuesto();

        educativa2.establecerNombre(nombre2);
        educativa2.establecerTipo(tipo2);
        educativa2.establecerAlumnos(alumnos2);
        educativa2.establecerDocentes(docentes2);
        educativa2.establecerSedes(sedes2);
        educativa2.establecerGastos(gastos2);
        educativa2.calcularPresupuesto();

        System.out.printf("Institucion Educativa 1\nNombre: %s\nTipo: %s\n"
                + "Número de Alumnos: %d\n"
                + "Número de Docentes: %d\n"
                + "Número de Sedes: %d\n"
                + "Proyección de Gastos: $%.2f\n"
                + "Presupuesto de la Institución: $%.2f\n",
                educativa1.obtenerNombre(), educativa1.obtenerTipo(),
                educativa1.obtenerAlumnos(), educativa1.obtenerDocentes(),
                educativa1.obtenerSedes(), educativa1.obtenerGastos(),
                educativa1.obtenerPresupuesto());

        System.out.printf("\nInstitucion Educativa 2\nNombre: %s\nTipo: %s\n"
                + "Número de Alumnos: %d\n"
                + "Número de Docentes: %d\n"
                + "Número de Sedes: %d\n"
                + "Proyección de Gastos: $%.2f\n"
                + "Presupuesto de la Institución: $%.2f\n",
                educativa2.obtenerNombre(), educativa2.obtenerTipo(),
                educativa2.obtenerAlumnos(), educativa2.obtenerDocentes(),
                educativa2.obtenerSedes(), educativa2.obtenerGastos(),
                educativa2.obtenerPresupuesto());
    }

}
