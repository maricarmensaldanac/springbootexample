package com.example.demo.javaExcersices;

import java.util.*;
import java.util.stream.Collectors;

public class MergeNames {

    public static String[] uniqueNames(String[] names1, String[] names2) {

        Set mySet = Arrays.asList(names1).stream().collect(Collectors.toSet());
        Set mySet2 = Arrays.asList(names2).stream().collect(Collectors.toSet());
        mySet.addAll(mySet2);

        String[] array = (String[]) mySet.toArray(new String[mySet.size()]);
        return array;
    }

    public static void main(String[] args) {
        String[] names1 = new String[] {"Ava", "Emma", "Olivia"};
        String[] names2 = new String[] {"Olivia", "Sophia", "Emma"};
        MergeNames.uniqueNames(names1, names2);
        System.out.println(String.join(", ", MergeNames.uniqueNames(names1, names2))); // should print Ava, Emma, Olivia, Sophia
    }
}
