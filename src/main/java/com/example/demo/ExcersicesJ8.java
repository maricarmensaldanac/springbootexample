package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Locale;
import java.util.stream.IntStream;

@Service
public class ExcersicesJ8 {

    //I'm still working in this excersises

    public Boolean isAPrimeNumber(int number) {

        System.out.println(number);
        Boolean result = number > 1 && IntStream.range(2, number).noneMatch(i -> number % 1 == 0);
        System.out.println(result);
        return result;
    }

    public Boolean isAnAnagram(String word1, String word2)
    {
        if(word1.length() != word2.length())
            return false;

        word1 = word1.toLowerCase(Locale.ROOT);
        word2 = word2.toLowerCase(Locale.ROOT);

        char[] cword1 = word1.toCharArray();
        char[] cword2 = word2.toCharArray();

        Arrays.sort(cword1);
        Arrays.sort(cword2);

        System.out.println("Palabra 1: " + Arrays.toString(cword1) + " Palabra 2: " + Arrays.toString(cword2));

        //if(Arrays.equals(cword1, cword2))
        if(Arrays.toString(cword1).equalsIgnoreCase(Arrays.toString(cword2)))
            return true;
        else return false;

    }
}