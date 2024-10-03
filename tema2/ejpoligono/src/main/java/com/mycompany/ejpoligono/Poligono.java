/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejpoligono;

/**
 *
 * @author DAW109
 */
public class Poligono {
    private int numlados;
    private String Nombre;
    
    
    
    public Poligono(){
        
        
    }
    public Poligono(int numlados,String Nombre){
        this.numlados=numlados;
        this.Nombre=Nombre;
        
        
       
    }
    
    public double Perimetro(double longitud){
  return numlados*longitud;      
        
        
    }
}
