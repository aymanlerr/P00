import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/*
 * I declare that this code was written by me. 
 * I do not copy or allow others to copy my code. 
 * I understand that copying code is considered as plagiarism.
 * 
 * Student Name: Imanul Aiman
 * Student ID: 22015131
 * Class: W64P
 * Date/Time created: Wednesday 24-05-2023 09:45
 */

/**
 * @author 22015131
 *
 */
public class CalculatorTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		int a = 1234;
		int b = 8765;

		Calculator cal = new Calculator();
		int actual = cal.add(a, b);
		int expected = 9999;
		assertEquals(expected, actual);
	}
	@Test
	public void testSubtract() {
		int a = 9876;
		int b = 4321;
		
		Calculator cal = new Calculator();
		int actual = cal.subtract(a, b);
		int expected = 5555;
		assertEquals(expected, actual);
	}
	@Test
    public void testMultiply() {
		int a = 10;
		int b = 2;
		
        Calculator cal = new Calculator();
        int actual = cal.multiply(a, b);
        int expected = 20;
        assertEquals(expected, actual);
	}
	@Test
    public void testDivide() {
		int a = 20;
		int b = 10;
		
        Calculator cal = new Calculator();
        int actual = cal.divide(a, b);
        int expected = 2;
        assertEquals(expected, actual);
	}
}
