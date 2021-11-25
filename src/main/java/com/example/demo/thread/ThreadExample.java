package com.example.demo.thread;

import java.util.stream.IntStream;

public class ThreadExample extends Thread{

    @Override
    public void run(){
        try{
            IntStream.range(0, 100).forEach(x -> System.out.println("Thread " + x));
        } catch(Exception e)
        {
            System.out.println("Falló el hilo :v" + e);
        }
    }
}