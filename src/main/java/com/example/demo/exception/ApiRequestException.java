package com.example.demo.exception;

//Custom Exception that we can throw our exception
//The runtime exception is the superclass of the Exceptions and can be throw during the normal function of JVM
public class ApiRequestException extends RuntimeException{

    //We generate the constructor to call it
    public ApiRequestException(String message) {
        super(message);
    }

    public ApiRequestException(String message, Throwable cause) {
        super(message, cause);
    }
}