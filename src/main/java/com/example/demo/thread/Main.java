package com.example.demo.thread;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        ThreadExample hilo1 = new ThreadExample();
        hilo1.start();

        Thread hilo2 = new Thread(new RThread(2));
        hilo2.start();

        IntStream.range(0,50).forEach(x -> System.out.println("Main for " + x));
    }
}