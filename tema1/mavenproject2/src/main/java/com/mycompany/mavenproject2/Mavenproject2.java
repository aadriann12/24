/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject2;

/**
 *
 * @author DAW109
 */
public class Mavenproject2 {

    public static void main(String[] args) {
 char calificacion, calificacion2;
 boolean resultado;
 int nota=7;
 resultado= (nota>=5) ? true:false;
 calificacion = resultado ? 'a':'s';//como es un char si puede ser letras!!EXAMEN
 
 calificacion2= !resultado ? 'a':'s';// EL ! ES PARA QUE NO SEA
    }
}
