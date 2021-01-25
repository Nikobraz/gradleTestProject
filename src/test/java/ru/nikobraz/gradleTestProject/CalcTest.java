package ru.nikobraz.gradleTestProject;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class CalcTest {

    @Test
    @Owner("Ярушин Никита")
    public void sum() {
        assertEquals(4, Calc.sum(2,2));
        assertNotEquals(5, Calc.sum(2,2));
    }

    @Test
    @Owner("Ярушин Никита")
    public void sub() {
        assertEquals(4, Calc.sub(6,2));
        assertNotEquals(5, Calc.sub(2,2));
    }

    @Test
    @Owner("Ярушин Никита")
    public void mul() {
        assertEquals(8, Calc.mul(4,2));
        assertNotEquals(5, Calc.mul(2,2));
    }

    @Test
    @Owner("Ярушин Никита")
    public void div() {
        assertEquals(3, Calc.div(6,2));
        assertNotEquals(5, Calc.div(26,2));
    }
}