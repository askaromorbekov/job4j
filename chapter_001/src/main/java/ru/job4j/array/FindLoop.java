package ru.job4j.array;

public class FindLoop {
    /**
     * Классический метод поиска по индексу в массиве.
     * @param data .
     * @param el .
     * @return rst .
     */
    public int indexOf(int[] data, int el) {
        int rst = -1; // если элемента нет в массиве, то возвращаем -1.
        for (int i = 0; i < el; i++) {
            if (data[i] == el) {
                rst = i;
                break;
            }
        }
        return rst;
    }
}