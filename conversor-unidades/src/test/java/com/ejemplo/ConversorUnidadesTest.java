package com.ejemplo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ConversorUnidadesTest {

    @Test
    public void testMetrosACentimetros() {
        assertEquals(100.0, ConversorUnidades.metrosACentimetros(1.0));
    }

    @Test
    public void testMetrosACentimetrosDecimal() {
        assertEquals(250.0, ConversorUnidades.metrosACentimetros(2.5));
    }

    @Test
    public void testMetrosAMilimetros() {
        assertEquals(1000.0, ConversorUnidades.metrosAMilimetros(1.0));
    }

    @Test
    public void testMetrosAMilimetrosDecimal() {
        assertEquals(2500.0, ConversorUnidades.metrosAMilimetros(2.5));
    }

    @Test
    public void testCentimetrosAMilimetros() {
        assertEquals(10.0, ConversorUnidades.centimetrosAMilimetros(1.0));
    }

    @Test
    public void testCentimetrosAMilimetrosDecimal() {
        assertEquals(75.0, ConversorUnidades.centimetrosAMilimetros(7.5));
    }

    @Test
    public void testMilimetrosAMetros() {
    assertEquals(1.0, ConversorUnidades.milimetrosAMetros(1000.0));
    }

    @Test
    public void testMilimetrosAMetrosDecimal() {
        assertEquals(2.5, ConversorUnidades.milimetrosAMetros(2500.0));
    }

    @Test
    public void testMetrosACentimetros2() {
        assertEquals(200.0, ConversorUnidades.metrosACentimetros(2.0));
    }

    @Test
    public void testMetrosAMilimetros2() {
        assertEquals(2700.0, ConversorUnidades.metrosAMilimetros(2.7));
    }

    @Test
    public void testCentimetrosAMilimetros2() {
        assertEquals(60.0, ConversorUnidades.centimetrosAMilimetros(6.0));
    }

    @Test
    public void testMilimetrosAMetros2() {
    assertEquals(8.0, ConversorUnidades.milimetrosAMetros(8000.0));
    }
}