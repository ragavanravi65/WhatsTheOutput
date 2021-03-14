package batch2;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AppTest2 {
	
	@BeforeClass
	public static void beforeall() {
		System.out.println("beforeClass");
	}
	@Before
	public void before1() {
		System.out.println("before:>");
	}
	@Test
	public void testOne() {
		System.out.println("Test");
	}

	@Test
	public void testOne2() {
		System.out.println("Test2");
	}
	@After
	public void tearDown() {
		System.out.println("After");
	}
	@AfterClass
	public static void tearAll() {
		System.out.println("AfterClass");
	}
}
