package com.fernandopaniagua.jenkinsdemo.test;

import com.fernandopaniagua.jenkinsdemo.Calculadora;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculadoraTest {

    private Calculadora calc;

    @BeforeEach
    public void setUp() {
        calc = new Calculadora();
    }

    @Test
    public void testSumar() {
        assertEquals(5, calc.sumar(2, 3));
    }

    @Test
    public void testRestar() {
        assertEquals(1, calc.restar(3, 2));
    }

    @Test
    public void testMultiplicar() {
        assertEquals(6, calc.multiplicar(2, 3));
    }

    @Test
    public void testDividir() {
        assertEquals(2, calc.dividir(6, 3));
    }

    @Test
    public void testDividirPorCero() {
        assertThrows(ArithmeticException.class, () -> {
            calc.dividir(5, 0);
        });
    }
}
