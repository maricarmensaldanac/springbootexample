package com.example.demo.combinatorpattern;

import java.time.LocalDate;

import com.example.demo.combinatorpattern.CustomerRegistrationValidator.*;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer(
                "Alice",
                "alicegmail.com",
                "+0898787879878",
                LocalDate.of(2000, 1, 1)
        );

        //System.out.println(new CustomerValidatorService().isValid(customer));

        //Using combinator pattern
        ValidationResult result =
                CustomerRegistrationValidator.isEmailValid()
                .and(CustomerRegistrationValidator.isPhoneNumberValid())
                .and(CustomerRegistrationValidator.isAnAdult())
                .apply(customer);

        System.out.println(result);

        if(result != ValidationResult.SUCCESS){
            throw new IllegalStateException(result.name());
        }
    }
}