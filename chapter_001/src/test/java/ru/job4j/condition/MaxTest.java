package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test class Max
 * @author Askar Omorbekov (omorbekov.a@yandex.ru)
 * @version 0.7
 * @since 01.04.2019
 */

public class MaxTest {
    /**
     * Test Max
     */
    @Test
    public void whenMax1To2Then2() {
        Max max = new Max();
        int result = max.max(2, 1);
        assertThat(result, is(2));
    }
}
