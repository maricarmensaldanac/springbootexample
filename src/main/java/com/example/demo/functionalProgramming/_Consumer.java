package com.example.demo.Consumer;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {

        Customer maria = new Customer("Maria", "9999");
        greetCustomer(maria);

        //Using Consumer functional Interface
        greetCostumerConsumer.accept(maria);

        //BiCostumber
        greetCostumerConsumerV2.accept(maria, false);
    }

    static void greetCustomer(Customer customer){
        System.out.println("Hello " + customer.customerName + " , thanks for registering phone number " +
                customer.customerPhoneNumber);
    }

    static Consumer<Customer> greetCostumerConsumer = customer -> System.out.println("Hello " + customer.customerName + " , thanks for registering phone number " +
            customer.customerPhoneNumber);

    static BiConsumer<Customer, Boolean> greetCostumerConsumerV2 = (customer, showPhoneNumber)
            -> System.out.println("Hello " + customer.customerName + " , thanks for registering phone number " +
            (showPhoneNumber ? customer.customerPhoneNumber : "*****"));

    static class Customer{
        private final String customerName;
        private final String customerPhoneNumber;

        public Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
}