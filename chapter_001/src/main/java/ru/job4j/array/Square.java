package ru.job4j.array;

public class Square {
    /**
     * Metod Возведение в степень - 2 каждую ячейку в массиве.
     * @param bound .
     * @return rst.
     */
    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        // заполнить массив через цикл элементами от 1 до bound возведенными в квадрат
        for (int i = 0; i < rst.length; i++) {
            rst[i] = (int) Math.pow(i + 1, 2);
        }
        return rst;
    }
}
