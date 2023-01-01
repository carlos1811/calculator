package com.carlos.calculadora.services;


import com.carlos.calculadora.dto.Operation;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CalculatorServiceTest {

    @Autowired
    private CalculatorService calculatorService;

    private Operation operation;

    @BeforeEach
    void setUp() {
        operation = new Operation(new BigDecimal(1),new BigDecimal(1),new BigDecimal(0));
    }

    @Test
    void testGetAddReturnResultTwo() {
        Operation result = calculatorService.getAdd(operation);
        assertEquals(2, result.getResult().intValue());
    }

    @Test
    void testGetSubstractReturnResultTwo() {
        Operation result = calculatorService.getSubstract(operation);
        assertEquals(0, result.getResult().intValue());
    }



}
