package com.carlos.calculadora.controllers;

import com.carlos.calculadora.dto.Operation;
import com.carlos.calculadora.services.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class CalculatorController {

    @Autowired
    private CalculatorService calculatorService;

    @GetMapping("/add")
    public Operation add(Operation operation) {

        return calculatorService.getAdd(operation);
    }

    @GetMapping("/subtract")
    public Operation subtract(Operation operation) {

        return calculatorService.getSubstract(operation);
    }

}
