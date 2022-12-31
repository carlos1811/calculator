package com.carlos.calculadora.controllers;


import com.carlos.calculadora.dto.Operation;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class CalculatorController {

	@GetMapping("/add")
	public Operation add(Operation operation) {

		operation.setResult(operation.getInputA().add(operation.getInputB()));

		return operation;
	}

	@GetMapping("/subtract")
	public Operation subtract(Operation operation) {

		operation.setResult(operation.getInputA().subtract(operation.getInputB()));

		return operation;
	}

}
