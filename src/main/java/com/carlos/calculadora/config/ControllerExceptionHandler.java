package com.carlos.calculadora.config;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ControllerExceptionHandler {

    private static final String NULLPOINTER = "null field";
    private static final String ARITHMETIC = "Arithmetic exception";


    @ExceptionHandler(NullPointerException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResponseEntity<String> handleNullPointer(RuntimeException ex) {
        return new ResponseEntity<>(NULLPOINTER, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(ArithmeticException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResponseEntity<String> handleArithmetic(RuntimeException ex) {
        return new ResponseEntity<>(ARITHMETIC, HttpStatus.BAD_REQUEST);
    }

}