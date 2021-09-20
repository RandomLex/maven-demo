package by.itacademy.jee.mavendemo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for App.
 */
public class AppTest {

    @Test
    public void sumAPositiveBPositive() {
        //given
        int a = 5;
        int b = 10;
        int expectedSum = 15;
        //when
        int actualSum = App.sum(a, b);
        //then
        assertEquals(expectedSum, actualSum);
    }

    @Test
    public void sumAPositiveMaximaBPositive() {
        //given
        int a = Integer.MAX_VALUE;
        int b = 10;
        int expectedSum = -2147483639;
        //when
        int actualSum = App.sum(a, b);
        //then
        assertEquals(expectedSum, actualSum);
    }
}
