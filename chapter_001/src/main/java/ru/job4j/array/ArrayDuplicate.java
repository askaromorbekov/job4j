package ru.job4j.array;

import java.util.Arrays;
/**
 *
 */
public class ArrayDuplicate {
    /**
     * Metod duplicate.
     * @param array .
     * @return .
     */
    public String[] remove(String[] array) {
        int arr = array.length;
        for (int i = 0; i < arr; i++) {
            for (int j = i + 1; j < arr; j++) {
                if (array[i].equals(array[j])) {
                    array[j] = array[arr - 1];
                    arr--;
                    j--;
                }
            }
        }
        return Arrays.copyOf(array, arr);
    }
}
