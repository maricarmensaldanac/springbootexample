package com.example.demo.service;

import com.example.demo.enumerator.Gender;
import com.example.demo.model.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@Service
public class PersonService {

    public List<Person> numberOf(Gender gender)
    {
        List<Person> people = new ArrayList<>();
        people.add(new Person("John", Gender.MALE));
        people.add(new Person("Maria", Gender.FEMALE));
        people.add(new Person("Aisha", Gender.FEMALE));
        people.add(new Person("Alex", Gender.MALE));
        people.add(new Person("Alice", Gender.FEMALE));

        //Get all the same gender

        System.out.println("========== Imperative Aproach ===========");
        List<Person> sameGender = new ArrayList<>();
        for(Person person : people) {
            if(Gender.FEMALE.equals(person.getGender()))
            {
                sameGender.add(person);
            }
        }
        //Print list
        for(Person person : sameGender) {
            System.out.println(person);
        }

        //Stream allows us to go to an abstract mode and simply tell it what we want.
        System.out.println("=========== Declarative Aproach =============");

        Predicate<Person> personPredicate = person -> Gender.FEMALE.equals(person.getGender());

        List<Person> sameGenderG = people.stream()
                .filter(personPredicate)
                .collect(Collectors.toList());

        sameGenderG.forEach(System.out::println);

        return sameGender;
    }
}