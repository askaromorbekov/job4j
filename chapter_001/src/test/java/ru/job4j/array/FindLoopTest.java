package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * @author Askar Omorbekov (omorbekov.a@yandex.ru)
 * @version 10.04.2019
 * @since 0.1
 */
public class FindLoopTest {
    @Test
    public void whenArrayHas5Then0() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 10, 3};
        int value = 5;
        int result = find.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }

    /**
     * Тест на ошибку в поиске индекса в массиве.
     */
    @Test
    public void whenArrayHas3Then2() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 10, 3, 10, 15, 23};
        int value = 15;
        int result = find.indexOf(input, value);
        int expect = 4;
        assertThat(result, is(expect));
    }
}
