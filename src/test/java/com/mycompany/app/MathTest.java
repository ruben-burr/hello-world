package com.mycompany.app;
import static org.junit.Assert.*;
import org.junit.Test;

public class MathTest  {

	@Test
	public void sum() {
		assertEquals(2, new Math().sum(1, 1));
	}
}
