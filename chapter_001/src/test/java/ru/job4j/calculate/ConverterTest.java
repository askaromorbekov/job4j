package ru.job4j.calculate;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test converter
 *
 * @author Askar Omorbekov (omorbekov.a@yandex.ru)
 * @version 0.3
 * @since 30.03.2019
 */

public class ConverterTest {
    /**
     * Test Convert to dollar.
     */
    @Test
    public void when379TengeToDollarThen10() {
        Converter converter = new Converter();
        int result = converter.tengeToDollar(379, 3790);
        int expected = 10;
        assertThat(result, is(expected));
    }
    /**
     * Test Convert to euro.
     */
    @Test
    public void when427TengeToEuroThen10() {
        Converter converter = new Converter();
        int result = converter.tengeToEuro(427, 4270);
        int expected = 10;
        assertThat(result, is(expected));
    }
    /**
     * Test Convert to tenge.
     */
    @Test
    public void when427EuroToTengeThen4270() {
        Converter converter = new Converter();
        int result = converter.euroToTenge(427, 10);
        int expected = 4270;
        assertThat(result, is(expected));
    }

    /**
     * Test Convert to tenge.
     */
    @Test
    public void when427DollarToTengeThen3790() {
        Converter converter = new Converter();
        int result = converter.dollatToTenge(379, 10);
        int expected = 3790;
        assertThat(result, is(expected));
    }
}
