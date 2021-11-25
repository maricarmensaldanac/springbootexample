package com.example.demo.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapExample {

    public static void main(String[] args) {
        //Accepts null value but we can just have one null value
        Map<String, String> mapa1 = new HashMap<String, String>();
        mapa1.put(null, "red");
        mapa1.put("verde", "green");
        mapa1.put("azul", "blue");
        mapa1.put("azul", "white");

        System.out.println(mapa1.get(null));

        System.out.println("===========================");
        //With funcional programming
        System.out.println("HashMap");
        mapa1.forEach((K,V) -> System.out.println( K + " -> " + V));
        System.out.println("===========================");

        //Does not allows null keys
        Map<String, String> treeMapObj = new TreeMap<>();
        treeMapObj.put("rojo", "red");
        treeMapObj.put("verde", "green");
        treeMapObj.put("azul", "blue");
        treeMapObj.put("azul", "white");

        System.out.println("Treemap");
        treeMapObj.forEach((K,V) -> System.out.println( K + " -> " + V));
        System.out.println("===========================");

        Map<String, String> linkedHashMapObj = new LinkedHashMap<>();
        linkedHashMapObj.put(null, "red");
        linkedHashMapObj.put("verde", "green");
        linkedHashMapObj.put("azul", "blue");
        linkedHashMapObj.put("azul", "white");
        System.out.println("Linked hash map");
        linkedHashMapObj.forEach((K,V) -> System.out.println( K + " -> " + V));
        System.out.println("===========================");
    }
}
