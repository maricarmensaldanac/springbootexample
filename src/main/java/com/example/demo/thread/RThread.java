package com.example.demo.thread;

import java.util.stream.IntStream;

public class RThread implements  Runnable{
    private int id;

    public RThread(int id)
    {
        this.id = id;
    }
    public void run(){
        try{
            IntStream.range(0, 100).forEach(x -> System.out.println("Ejecutando runnable " + x));
        } catch(Exception e)
        {
            System.out.println("Falló elv el runnable :v" + e);
        }
    }
}