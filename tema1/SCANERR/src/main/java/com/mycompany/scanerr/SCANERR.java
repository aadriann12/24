

package com.mycompany.scanerr;

import java.util.Scanner;

/**
 *
 * @author DAW109
 */
public class SCANERR {

    public static void main(String[] args) {
String nombre;
int edad;
Scanner teclado = new Scanner(System.in);
        System.out.println("dime tu nombre bebe");
        nombre=teclado.next();
        System.out.println("dime tu edad bebe");
        edad=teclado.nextInt();
        System.out.println("te llamas"
                + nombre + "y tu edad es"
                        + edad);

    }
}
