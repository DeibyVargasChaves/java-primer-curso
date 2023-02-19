package com.company;

import java.util.Scanner;
public class ThrowMain {
    public static void main(String[] args) {

        try {
            leerNombre();
        } catch (NameFormantException e) {
            e.printStackTrace();
        }
    }






     private static void leerNombre() throws NameFormantException {

         Scanner teclado = new Scanner(System.in);
         System.out.println("Ingrese su nombre");
         while (teclado.hasNext()) {
         System.out.println("introduce su nombre");
         String nombre = teclado.next();
         if (nombre.length() < 8){
             teclado.close();
             throw new NameFormantException("nombre de minimo 8 letras");
             }
         }
         teclado.close();
    }

}
