package com.carlos.calculadora.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Operation implements Serializable {

	private BigDecimal inputA;

	private BigDecimal inputB;

	private BigDecimal result;

}
