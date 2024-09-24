/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ej8_3;

import java.util.Scanner;

/**
 *
 * @author DAW109
 */
public class Ej8_3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int entradasinf;
        int entradasadu;
        double precioadu=20, precioinf=15.50;
        
        System.out.println("di numero de entradas infantiles");
        entradasinf=teclado.nextInt();
        System.out.println("di numero de entradas adultos");
        entradasadu=teclado.nextInt();
        
        double totalinf=(precioinf*entradasinf);
          double totaladu=(precioadu*entradasadu);
          double total=(totalinf+totaladu);
          double descuento=0.05;
          double totalcondescuento=(total-(total*descuento));
          double esverdad;
          esverdad= (total<=100) ? totalcondescuento : total;
        System.out.println("es true"+esverdad);
}
}