package ru.job4j.condition;

/**
 * Max из трех чисел
 */
public class MultiMax {
    /**
     * Метод с использованием условного оператора "if" для максимума из трех чисел.
     * @param first .
     * @param second .
     * @param third .
     * @return result Max.
     */
    public int max(int first, int second, int third) {
        int result;
        result = (third > second) ? (third > first) ? third : first : second;
        return result;
    }
}
