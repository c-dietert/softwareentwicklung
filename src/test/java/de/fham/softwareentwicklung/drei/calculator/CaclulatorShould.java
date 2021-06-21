package de.fham.softwareentwicklung.drei.calculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CalculatorShould {

    @Test
    void test1() {
        Calculator calculator = new Calculator();

        int result = calculator.calc(2, 3);

        assertThat(result).isEqualTo(3);
    }

    @Test
    void test2() {
        Calculator calculator = new Calculator();

        int result = calculator.calc(2, 1);

        assertThat(result).isEqualTo(2);
    }

    @Test
    void test3() {
        Calculator calculator = new Calculator();

        int result = calculator.calc(1, 1);

        assertThat(result).isEqualTo(1);
    }
}