package com.example.demo.functionalInterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {

    public static void main(String[] args) {
        //Functions examples (Takes 1 argument and produces 1 result)
        int increment = incrementByOne(1);
        System.out.println("Increment 1 -> "+ increment);

        int increment2 = incrementByOneFunction.apply(1);
        System.out.println("Increment 2 -> " + increment2);

        int multiply = multiplyBy10Function.apply(increment2);
        System.out.println("Multiply -> " + multiply);

        int addBy1AndThenMultply = addBy1AndThenMultiply.apply(4);
        System.out.println("AddBy1AndThenMultply -> " + addBy1AndThenMultply);

        //BiFunction (Takes 2 arguments, returns one result)
        System.out.println("incremenByOneAndMultiply -> " + incremenByOneAndMultiply(4, 100));
        System.out.println("incremenByOneAndMultiplyFunction -> " + incremenByOneAndMultiplyFunction.apply(4, 100));
    }

    //Functions
    static int incrementByOne(int number){
        return number + 1;
    }

    static Function<Integer, Integer> incrementByOneFunction = number -> number + 1;

    static Function<Integer, Integer> multiplyBy10Function = number -> number * 10;

    static Function<Integer, Integer> addBy1AndThenMultiply = incrementByOneFunction.andThen(multiplyBy10Function);


    //-----

    //BiFunctions
    static int incremenByOneAndMultiply(int number, int numToMultiplyBy){
        return (number + 1) * numToMultiplyBy;
    }

    static BiFunction<Integer, Integer, Integer> incremenByOneAndMultiplyFunction =
            (numberToIncremenByOn, numberToMultiplyBy)
                    -> (numberToIncremenByOn + 1) * numberToMultiplyBy;


}