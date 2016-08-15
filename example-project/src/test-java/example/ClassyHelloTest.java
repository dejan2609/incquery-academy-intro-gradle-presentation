package example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ClassyHelloTest {

	@Test
	public void test() {
		assertEquals("Hello, World", ClassyHello.getData());
	}
			
}
