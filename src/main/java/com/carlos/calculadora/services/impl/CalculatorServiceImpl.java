package com.carlos.calculadora.services.impl;

import com.carlos.calculadora.dto.Operation;
import com.carlos.calculadora.services.CalculatorService;
import io.corp.calculator.TracerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Autowired
    private TracerImpl tracer;

    @Override
    public Operation getAdd(Operation operation) {
        operation.setResult(operation.getInputA().add(operation.getInputB()));
        tracer.trace(operation.getResult());
        return operation;
    }

    @Override
    public Operation getSubstract(Operation operation) {
        operation.setResult(operation.getInputA().subtract(operation.getInputB()));
        tracer.trace(operation.getResult());
        return operation;
    }
}