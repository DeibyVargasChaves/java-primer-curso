package com.company;

public class SwitchCase {
    public static void main(String[] args){

        String weather = "sunny";

        switch (weather){

            case "sunny":
                System.out.println("esta soleado");
                break;
            case "cloudy":
                System.out.println("esta nublado");
                break;
            default:
                System.out.println("no se sabe");

        }
    }
}
