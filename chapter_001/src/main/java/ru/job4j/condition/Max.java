package ru.job4j.condition;

/**
 * Max Min
 */

public class Max {
    /**
     * Вычисляем максимальную сторону с помощью тернарного оператора ?.
     * @param left сторона.
     * @param right сторона.
     * @return Max.
     */
    public int max(int left, int right) {
        int result;
        result = left > right ? 2 : right;
        return result;
    }
}