/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tema11;
import java.util.Scanner;
/**
 *
 * @author DAW109
 */
public class Tema11 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
 
        System.out.print("¿Está lloviendo? (true/false): ");
        boolean llueve = scanner.nextBoolean();
        
        System.out.print("¿La tarea está hecha? (true/false): ");
        boolean tareahecha = scanner.nextBoolean();
        
        System.out.print("¿Vamos a la biblioteca? (true/false): ");
        boolean irbiblioteca = scanner.nextBoolean();
        
        // Lógica para determinar si podemos salir
        boolean salimos = (!llueve && tareahecha) || irbiblioteca;
        System.out.println("¿Podemos salir? " + salimos);

    }
}
