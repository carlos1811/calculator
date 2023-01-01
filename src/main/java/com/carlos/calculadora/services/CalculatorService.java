package com.carlos.calculadora.services;

import com.carlos.calculadora.dto.Operation;


public interface CalculatorService {

    Operation getAdd(Operation operation);

    Operation getSubstract(Operation operation);

}
