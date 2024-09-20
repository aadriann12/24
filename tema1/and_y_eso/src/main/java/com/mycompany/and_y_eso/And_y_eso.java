/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.and_y_eso;

/**
 *
 * @author DAW109
 */
public class And_y_eso {

    public static void main(String[] args) {
  enum Talla {s,m,l,xl}//con corchetes IMPORTANTE
Talla  MiTalla;//creo mi talla de una talla
MiTalla=Talla.m;//digo que mi talla es la m de esa enumeracion
        System.out.println("la talla es " + MiTalla);
    }
}
