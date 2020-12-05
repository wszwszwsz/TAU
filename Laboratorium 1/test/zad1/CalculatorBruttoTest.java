package zad1;

import static java.lang.System.out;
import static org.junit.Assert.*;
import org.junit.*;

public class CalculatorBruttoTest {
	private CalculatorBrutto calculator;
	
	@Before
	public void setUp(){
		calculator = new CalculatorBrutto();
		out.println("Before");
	}
	
	@After
	public void tearDown(){
		calculator = null;
		out.println("After");
	}
	
	@Test
	public void testBrutto1() {
		double result = CalculatorBrutto.wynagrodzenieNetto(3000);
		assertEquals(2201.30,result,2);
		out.println("Test1");
	}
	
	@Test
	public void testBrutto2() {
		double result = CalculatorBrutto.wynagrodzenieNetto(2600);
		assertEquals(1919.29,result,2);
		out.println("Test1");
	}
	
	@Test
	public void testBrutto3() {
		double result = CalculatorBrutto.wynagrodzenieNetto(10000);
		assertEquals(2201.30,result,2);
		out.println("Test1");
	}
		
}
