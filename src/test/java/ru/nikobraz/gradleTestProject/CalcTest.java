package ru.nikobraz.gradleTestProject;

import org.junit.Test;

import static org.junit.Assert.*;

import ru.nikobraz.gradleTestProject.Calc;

public class CalcTest {

    @Test
    public void sum() {
        assertEquals(4, Calc.sum(2,2));
        assertNotEquals(5, Calc.sum(2,2));
    }

    @Test
    public void sub() {
        assertEquals(4, Calc.sum(6,2));
        assertNotEquals(5, Calc.sum(2,2));
    }

    @Test
    public void mul() {
        assertEquals(8, Calc.sum(4,2));
        assertNotEquals(5, Calc.sum(2,2));
    }

    @Test
    public void div() {
        assertEquals(3, Calc.sum(6,2));
        assertNotEquals(5, Calc.sum(26,2));
    }
}