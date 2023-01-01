package com.carlos.calculadora.controllers;


import com.carlos.calculadora.dto.Operation;
import com.carlos.calculadora.services.CalculatorService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.test.web.servlet.MockMvc;

import java.math.BigDecimal;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(CalculatorController.class)
class CalculatorControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private CalculatorService calculatorService;

    @Test
    void testGetAddAndResultOk() throws Exception {
        given(calculatorService.getAdd(any())).willReturn(new Operation(new BigDecimal(1), new BigDecimal(1), new BigDecimal(2)));

        mockMvc.perform(get("/api/add"))
                .andExpect(status().is(HttpStatus.OK.value()))
                .andReturn()
                .getResponse();
    }

    @Test
    void testGetSubtractAndResultOk() throws Exception {
        given(calculatorService.getAdd(any())).willReturn(new Operation(new BigDecimal(1), new BigDecimal(1), new BigDecimal(2)));

        mockMvc.perform(get("/api/subtract"))
                .andExpect(status().is(HttpStatus.OK.value()))
                .andReturn()
                .getResponse();
    }

}
