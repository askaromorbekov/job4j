package ru.job4j.loop;

/**
 * Факториал числа
 */
public class Factorial {
    /**
     * Метод Цикл for для факториала n-числа.
     * @param n .
     * @return result .
     */
    public int calc(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
