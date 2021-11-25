package com.example.demo.HashCodeToStringEquals;

import ch.qos.logback.core.net.SyslogOutputStream;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Book libro1 = new Book("P en Java", "Juan", 25);
        Book libro2 = new Book("P en Java", "Juan", 25);

        if(libro1.equals(libro2)) {
            System.out.println("Same book");
        }else {
            System.out.println("Not the same book");
        }
    }
}

class Objeto{
    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Objeto objeto = (Objeto) o;
        return Objects.equals(name, objeto.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}