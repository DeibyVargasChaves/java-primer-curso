package com.company;
import java.util.Scanner;
public class ScannerMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int numero = scanner.nextInt();

        System.out.println("El numero introducido es " + numero);

        System.out.println("Hola mundo");
    }
}
// System.out = se escribe
// System.in = se lee