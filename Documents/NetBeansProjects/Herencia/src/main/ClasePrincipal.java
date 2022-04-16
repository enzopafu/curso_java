/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import operaciones.ClaseHijaResta;
import operaciones.ClaseHijaSuma;
public class ClasePrincipal {
    public static void main(String[] args) {
        ClaseHijaSuma mensajerosuma = new ClaseHijaSuma();
        mensajerosuma.PedirDatos();
        mensajerosuma.Suma();
        System.out.print("El resultado de la suma da:");
        mensajerosuma.MostrarResultado();
        
        ClaseHijaResta mensajeroresta = new ClaseHijaResta();
        mensajeroresta.PedirDatos();
        mensajeroresta.Resta();
        System.out.print("El resultado de la resta da: ");
        mensajeroresta.MostrarResultado();
        
    }
    
}
