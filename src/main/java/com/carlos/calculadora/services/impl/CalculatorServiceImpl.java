package com.carlos.calculadora.services.impl;

import com.carlos.calculadora.dto.Operation;
import com.carlos.calculadora.services.CalculatorService;
import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public Operation getAdd(Operation operation) {
        operation.setResult(operation.getInputA().add(operation.getInputB()));

        return operation;
    }

    @Override
    public Operation getSubstract(Operation operation) {
        operation.setResult(operation.getInputA().subtract(operation.getInputB()));

        return operation;
    }
}