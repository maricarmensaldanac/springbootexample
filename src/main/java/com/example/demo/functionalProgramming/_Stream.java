package com.example.demo.functionalProgramming;

import com.example.demo.enumerator.Gender;
import com.example.demo.model.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class _Stream {

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("John", Gender.MALE));
        people.add(new Person("Maria", Gender.FEMALE));
        people.add(new Person("Aisha", Gender.FEMALE));
        people.add(new Person("Alex", Gender.MALE));
        //people.add(new Person("Alice", Gender.PREFERENOTTOSAY));

        int entero1 = 0;
        Integer entero2 = 1;

        entero1 = entero2;

        people.stream()
                .map(person -> person.getGender())//Convert to a list of genders
                .collect(Collectors.toSet()) //We collect it into a Set (Wich has no duplicates)
                .forEach(System.out::println);

        System.out.println(people.stream()
                .noneMatch(person -> Gender.PREFERENOTTOSAY.equals(person.getGender())));
    }
}