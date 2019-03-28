package ru.job4j.calculate;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Petr Arsentev (parsentev@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
public class CalculateTest{
	/**
	 * Test echo
	*/
	@Test
	public void whenTakeNameThenThreeEchoPlusName(){
		String input = "Askar Omorbekov";
		String expect = "Echo, echo, echo : Askar Omorbekov"; 
		Calculate calc = new Calculate();
		String result = calc.echo(input);
		assertThat(result, is(expect));
	}
}