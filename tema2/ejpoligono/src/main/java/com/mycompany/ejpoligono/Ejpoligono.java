/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejpoligono;

/**
 *
 * @author DAW109
 */
public class Ejpoligono {

    public static void main(String[] args) {
       Poligono roberto = new Poligono(4, "cuadrado");
       
       double perimetro =roberto.Perimetro(4);
        System.out.println("el perimetro de roberto es " + perimetro);
       
    }
}
