package com.testes.testes;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    public void testSum(){
        Calculator calculator = new Calculator();
        System.out.println(calculator.sum(1, 1));
        assertThat(calculator.sum(1, 1)).isEqualTo(2);
    }
}
