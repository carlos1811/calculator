package com.carlos.calculadora.config;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@ExtendWith(MockitoExtension.class)
@SpringBootTest
class ControllerExceptionHandlerTest {

    @Mock
    private NullPointerException nullPointerException;

    @Mock
    private ArithmeticException arithmeticException;

    @InjectMocks
    private ControllerExceptionHandler handler;

    @Test
    void handleNullPointer_shouldReturnBadRequest() {
        ResponseEntity<String> response = handler.handleNullPointer(nullPointerException);
        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.BAD_REQUEST);
        assertThat(response.getBody()).isEqualTo("null field");
    }

    @Test
    void handleArithmetic_shouldReturnBadRequest() {
        ResponseEntity<String> response = handler.handleArithmetic(arithmeticException);
        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.BAD_REQUEST);
        assertThat(response.getBody()).isEqualTo("Arithmetic exception");
    }
}
