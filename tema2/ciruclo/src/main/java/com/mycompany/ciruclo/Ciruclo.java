/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ciruclo;

/**
 *
 * @author DAW109
 */
public class Ciruclo {
    private double radio;
public Ciruclo() { }



public Ciruclo (double radio) {
    this.radio=radio; 
}
public double getRadio() {
    return radio;
}
public void setRadio (double radio) {
    this.radio =radio;
}
public double area() { return Math.PI*Math.pow(radio, 2); }
public double longitud() { return 2*Math.PI*radio;

}
}
    

