package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ConversorTemperaturaTest {

    @Test
    void testFahrenheitParaCelsius_32F() {
        double resultado = ConversorTemperatura.fahrenheitParaCelsius(32);
        assertEquals(0.0, resultado, 0.001);
    }

    @Test
    void testFahrenheitParaCelsius_212F() {
        double resultado = ConversorTemperatura.fahrenheitParaCelsius(212);
        assertEquals(100.0, resultado, 0.001);
    }

    @Test
    void testFahrenheitParaCelsius_TemperaturaNegativa() {
        double resultado = ConversorTemperatura.fahrenheitParaCelsius(-40);
        assertEquals(-40.0, resultado, 0.001);
    }

    @Test
    void testFahrenheitParaCelsius_0F() {
        double resultado = ConversorTemperatura.fahrenheitParaCelsius(0);
        assertEquals(-17.777, resultado, 0.001);
    }

    @Test
    void testFahrenheitParaCelsius_ValorArbitrario() {
        double resultado = ConversorTemperatura.fahrenheitParaCelsius(77);
        assertEquals(25.0, resultado, 0.001);
    }
}
