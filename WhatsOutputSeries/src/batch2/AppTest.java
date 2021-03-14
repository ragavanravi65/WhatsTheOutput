package batch2;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;

public class AppTest {
	String msg="hello";
	int length=msg.length();
	@Test
	public void testOne() {
		System.out.println(length+" ");
		assertEquals(length,5);
	}
	@Test
	public void testTwo() {
		System.out.println(length+" ");
		assertEquals(length,5);
	}

	@After
	public void tearDown() {
		length=length+1;
		System.out.println(length+" ");
	}
}
