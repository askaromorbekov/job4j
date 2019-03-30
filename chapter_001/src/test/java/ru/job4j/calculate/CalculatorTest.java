package ru.job4j.calculate;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Askar Omorbekov (omorbekov.a@yandex.ru)
 * @version 0.2
 * @since 30.03.2019
 */

public class CalculatorTest {
    /**
     * Test +
     */
    @Test
    public void whenAddOnePlusOneThenTwo() {
        Calculator calc = new Calculator();
        double result = calc.add(1D, 1D);
        double expected = 2D;
        assertThat(result, is(expected));
    }
    /**
     * Test -
     */
    @Test
    public void whenSubtract10n5Than5() {
        Calculator calc = new Calculator();
        double result = calc.subtract(10D, 5D);
        double expected = 5D;
        assertThat(result, is(expected));
    }
    /**
     * Test /
     */
    @Test
    public void whenDiv20n10Than2() {
        Calculator calc = new Calculator();
        double result = calc.div(20D, 10D);
        double expected = 2D;
        assertThat(result, is(expected));
    }
    /**
     * Test *
     */
    @Test
    public void whenMultiple5n5Than25() {
        Calculator calc = new Calculator();
        double result = calc.multiple(5D, 5D);
        double expected = 25D;
        assertThat(result, is(expected));
    }
}
