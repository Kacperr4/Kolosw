package org.example;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        Calculator calculator = new Calculator(1 ,2);
        assertEquals(3,calculator.add());
//        assertThrows(IOException.class,calculator.add());
    }
}