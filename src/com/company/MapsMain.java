package com.company;

import java.util.Map;
import java.util.HashMap;
public class MapsMain {
    public static void main(String[] args) {

        Map<String, String> persona = new HashMap<>();

        persona.put("1425263A", "Nombre Apellido 1");
        persona.put("1425264B", "Nombre Apellido 2");
        persona.put("1425265C", "Nombre Apellido 3");

        System.out.println(persona);

        for(String key : persona.keySet()){
            System.out.println(key);
        }

        for(String value : persona.values()){
            System.out.println(value);
        }
        for(Map.Entry<String, String> pair : persona.entrySet()){
            System.out.println(pair.getKey() + " / " + pair.getValue());
        }
    }
}

