package com.example.demo.Optionals;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        Object value = Optional.ofNullable("Hello")
                //.orElseGet(() -> "default value");
                        .orElseThrow(() -> new IllegalStateException("Ex"));

        System.out.println(value);

        Optional.ofNullable(null)
                .ifPresent(email -> System.out.println("Sending email to " + email));
    }
}
