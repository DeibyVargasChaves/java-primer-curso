package com.company;

import java.util.ArrayList;
import java.util.List;

public class listMain {
    public static void main(String[] args) {

        List<String> nombre = new ArrayList<>();

        nombre.add("Juan");
        nombre.add("Pedro");
        nombre.add("Maria");
        nombre.add("Ana");
        System.out.println(nombre);

        for (String nombres : nombre){
            System.out.println(nombres);
        }

    }
}
