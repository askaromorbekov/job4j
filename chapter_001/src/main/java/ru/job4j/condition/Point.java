package ru.job4j.condition;

/**
 * Расстояние между точками в системе координат
 */
public class Point {
    /**
     * Расчет растояния между точками в системе координат
     * @param x1 точка в системе координат.
     * @param y1 точка в системе координат.
     * @param x2 точка в системе координат.
     * @param y2 точка в системе координат.
     * @return корень sqrt.
     */
    public double distance(int x1, int y1, int x2, int y2) {
        double first = Math.pow(x2 - x1, 2);
        double two = Math.pow(y2 - y1, 2);
        double result = Math.sqrt(first + two);
        return result;
    }
}
