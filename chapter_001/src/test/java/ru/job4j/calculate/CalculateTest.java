package ru.job4j.calculate;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Askar Omorbekov (omorbekov.a@yandex.ru)
 * @version 0.1
 * @since 28.03.2019
 */
public class CalculateTest {
	/**
	 * Test echo
	*/
	@Test
	public void whenTakeNameThenThreeEchoPlusName() {
		String input = "Askar Omorbekov";
		String expect = "Echo, echo, echo : Askar Omorbekov"; 
		Calculate calc = new Calculate();
		String result = calc.echo(input);
		assertThat(result, is(expect));
	}
}