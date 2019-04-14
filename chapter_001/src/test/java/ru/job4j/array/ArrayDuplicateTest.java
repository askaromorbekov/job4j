package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.hamcrest.collection.IsArrayContainingInAnyOrder.arrayContainingInAnyOrder;

/**
 * @author Askar Omorbekov (omorbekov.a@yandex.ru)
 * @version 14.04.2019
 * @since 0.1
 */
public class ArrayDuplicateTest {
    /**
     * Test
     */
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
        ArrayDuplicate duplicate = new ArrayDuplicate();
        String[] input = {"Java", "C#", "C++", "C#", "Ruby", "JavaScript", "Python"};
        String[] except = {"Java", "C#", "C++", "Ruby", "JavaScript", "Python"};
        String[] result = duplicate.remove(input);
        assertThat(result, arrayContainingInAnyOrder(except));
    }
}
