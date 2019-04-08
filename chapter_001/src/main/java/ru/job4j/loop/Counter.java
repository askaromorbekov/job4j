package ru.job4j.loop;

/**
 * Сумма четных чисел
 */

public class Counter {
    /**
     * Метод использует цикл for и вложенное условие if
     * @param start .
     * @param finish .
     * @return sum.
     */
    public int add(int start, int finish) {
        int sum = 0;
        for (start = 1; start <= finish; start++) {
            if (start % 2 == 0) {
                sum += start;
            }
        }
        return sum;
    }
}
