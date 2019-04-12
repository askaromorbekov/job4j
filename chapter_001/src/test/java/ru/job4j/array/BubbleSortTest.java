package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * @author Askar Omorbekov (omorbekov.a@yandex.ru)
 * @version 12.04.2019
 * @since 0.1
 */
public class BubbleSortTest {
    /**
     * Test Пузырьковый алгоритм
     */
    @Test
    public void whenSortArrayWithTenElementsThenSortedArray() {
        BubbleSort arrInt = new BubbleSort();
        int[] input = new int[]{1, 5, 4, 2, 3, 1, 7, 8, 0, 5};
        int[] result = arrInt.sort(input);
        int[] expect = new int[]{0, 1, 1, 2, 3, 4, 5, 5, 7, 8};
        assertThat(result, is(expect));
    }
    @Test
    public void whenSortArrayWithSevenElementsThenSortedArray() {
        BubbleSort arrInt = new BubbleSort();
        int[] input = new int[] {5, 3, 10, 7, 1, 4, 2};
        int[] result = arrInt.sort(input);
        int[] expect = new int[] {1, 2, 3, 4, 5, 7, 10};
        assertThat(result, is(expect));
    }
}
