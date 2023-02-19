package com.company;

public class WhileLoop {

    public static void main(String[] args) {



        int count = 0;
        while(count < 10){
            count++; // condition
            if (count == 6)
                break;

            System.out.println("hola mundo" + count);

        }
        System.out.println("fin");
    }
}
