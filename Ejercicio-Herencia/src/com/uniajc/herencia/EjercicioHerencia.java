/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.uniajc.herencia;

/**
 *
 * @author g.perezmoreno
 */
public class EjercicioHerencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // crear objeto de la clase cuenta
        Cuenta cuenta1 = new Cuenta(10000, 0);
        cuenta1.imprimir();
        
        cuenta1.consignar(2501);
        System.out.println("");
        cuenta1.imprimir();
        
    }
}
