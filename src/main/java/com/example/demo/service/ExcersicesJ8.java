package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Locale;
import java.util.stream.IntStream;

@Service
public class ExcersicesJ8 {

    //I'm still working in this excersises

    public String isAPrimeNumber(int number) {
        try {
            IntStream intex = IntStream.of(1, 2, 3);

            return ((true == number > 1 && IntStream.range(2, number).noneMatch(i -> number % i == 0)) ? "Is a prime number" : "Is not a prime number");

        }catch(Exception e)
        {
            return "Error";
        }
    }

    public String isAnAnagram(String word1, String word2)
    {
        try {
            if (word1.length() != word2.length())
                return "Is not an anagram";

            word1 = word1.toLowerCase(Locale.ROOT);
            word2 = word2.toLowerCase(Locale.ROOT);

            char[] cword1 = word1.toCharArray();
            char[] cword2 = word2.toCharArray();

            Arrays.sort(cword1);
            Arrays.sort(cword2);

            return Arrays.equals(cword1, cword2) ? "Is an anagram" : "Is not an anagram";
        }catch(Exception e)
        {
            return "Error";
        }
    }
}