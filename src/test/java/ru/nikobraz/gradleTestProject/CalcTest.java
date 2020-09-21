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
        assertEquals(4, Calc.sub(6,2));
        assertNotEquals(5, Calc.sub(2,2));
    }

    @Test
    public void mul() {
        assertEquals(8, Calc.mul(4,2));
        assertNotEquals(5, Calc.mul(2,2));
    }

    @Test
    public void div() {
        assertEquals(3, Calc.div(6,2));
        assertNotEquals(5, Calc.div(26,2));
    }
}