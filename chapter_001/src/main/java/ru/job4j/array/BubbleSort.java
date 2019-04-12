package ru.job4j.array;

public class BubbleSort {
    /**
     * Метод пузырьковой сортировки.
     * @param array - неотсортированный массив.
     * @return array - отсортированный массив.
     */
    public int[] sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
        return array;
    }
}
