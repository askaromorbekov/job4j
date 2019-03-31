package ru.job4j.calculate;

import org.junit.Test;
import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.assertThat;

/**
 * Test Fit
 *
 * @author Askar Omorbekov (omorbekov.a@yandex.ru)
 * @version 0.4
 * @since 31.03.2019
 */
public class FitTest {
    /**
     * Test Идеальный вес мужчины.
     */
    @Test
    public void manWeight() {
        Fit fit = new Fit();
        double weight = fit.manWeight(180);
        assertThat(weight, closeTo(92.0, 0.1));
    }
    /**
     * Test Идеальный вес женщины.
     */
    @Test
    public void womanWeight() {
        Fit fit = new Fit();
        double weight = fit.womanWeight(170);
        assertThat(weight, closeTo(69.0, 0.1));
    }
}
