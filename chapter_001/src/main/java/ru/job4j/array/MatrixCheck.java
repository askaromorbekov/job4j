package ru.job4j.array;

public class MatrixCheck {
    /**
     * Метод проверяющий по диагонали true & false.
     * @param data .
     * @return result .
     */
    public boolean mono(boolean[][] data) {
        boolean result = true;
        for (int i = 0; i < data.length; i++) {
            if (data[i][i] != data[0][0]) {
                result = false;
                break;
            } else if (data[data.length - 1 - i][i] != data[data.length - 1][0]) {
                result  = false;
                break;
            }
        }
        return result;
    }
}
