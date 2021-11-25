package com.example.demo.functionalProgramming;

import java.util.function.Supplier;

//Supplier: Returns a value
public class _Supplier {

    public static void main(String[] args) {
        System.out.println(getDBConnectionUrl());
        System.out.println(getDBConnectionUrlSupplier.get());
    }

    static String getDBConnectionUrl(){
        return "jdbc://localhost:5432/users";
    }

    static Supplier<String> getDBConnectionUrlSupplier = () -> "jdbc://localhost:5432/users";
}