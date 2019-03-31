package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * Test Расстояние между точками
 *
 * @author Askar Omorbekov (omorbekov.a@yandex.ru)
 * @version 0.5
 * @since 31.03.2019
 */

public class PointTest {
    /**
     * Тест Point()
     */
    @Test
    public void whenZeroAndTenThenTen() {
        Point point = new Point();
        double result = point.distance(5, 4, 10, 8);
        assertThat(result, is(6D));
    }

}
