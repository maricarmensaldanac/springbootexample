package com.example.demo.combinattorpattern;

import combinattorpattern.CustomerRegistrationValidator.*;

public interface CustomerRegistrationValidator extends Function<Customer, ValidationResult>{

    enum ValidationResult{

    }

}