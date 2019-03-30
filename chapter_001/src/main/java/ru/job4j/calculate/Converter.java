package ru.job4j.calculate;

/**
 * Конвертер валюты.
 */
public class Converter {
    /**
     * Конвертируем тенге в евро.
     * @param value тенге.
     * @return евро.
     */
    public int tengeToEuro(int value, int tenge) {
        return tenge / value;
    }
    /**
     * Конвертируем тенге в доллары.
     * @param value тенге.
     * @return доллары.
     */
    public int tengeToDollar(int value, int tenge) {
        return tenge / value;
    }
    /**
     * Конвертируем доллары в тенге.
     * @param value тенге.
     * @return тенге.
     */
    public int dollatToTenge(int value, int dollar) {
        return dollar * value;
    }
    /**
     * Конвертируем евро в тенге.
     * @param value тенге.
     * @return тенге.
     */
    public int euroToTenge(int value, int euro) {
        return euro * value;
    }
}
