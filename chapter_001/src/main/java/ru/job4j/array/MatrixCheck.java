package ru.job4j.array;

public class MatrixCheck {
    /**
     * Метод проверяющий по диагонали true & false.
     * @param data .
     * @return result .
     */
    public boolean mono(boolean[][] data) {
        boolean result = true;
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 0; i < data.length - 1; i++) {
                if (data[i][j] != data[i + 1][j + 1]) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }
}
