package ru.job4j.array;

public class Check {
    /**
     * Metod True or Falce.
     * @param data .
     * @return boolean.
     */
    public boolean mono(boolean[] data) {
        boolean result = true;
        for (int i = 0; i < data.length - 1; i++) {
            if (data[i] != data[i + 1]) {
                result = false;
            }
        }
        return result;
    }
}
