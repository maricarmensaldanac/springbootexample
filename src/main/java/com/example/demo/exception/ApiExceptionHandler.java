package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.ZoneId;
import java.time.ZonedDateTime;

//Indicates spring boot that this class will serve as a clas that will have ApiRequestException handler
@ControllerAdvice
public class ApiExceptionHandler {

    //Will be responsable by handling this exception.
    @ExceptionHandler(value = {ApiRequestException.class}) //The Exception that we are catching, if we have more we can set them here
    public ResponseEntity<Object> handleApiRequestException(ApiRequestException e) //We receive the custom exception
    {
        //1. Create a payload containing exception details
        HttpStatus badRequest = HttpStatus.BAD_REQUEST;
        ApiException apiException = new ApiException(
                e.getMessage(),
                badRequest,
                ZonedDateTime.now(ZoneId.of("Z"))
        );
        //2. Return response entity
        return new ResponseEntity<>(apiException, badRequest);
    }
}