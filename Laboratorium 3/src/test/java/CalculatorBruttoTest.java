import static java.lang.System.out;
import static org.junit.Assert.*;
import org.junit.*;

public class CalculatorBruttoTest {
	private CalculatorBrutto result;
	
	@Before
	public void setUp(){
		result = new CalculatorBrutto();
		out.println("Before");
	}
	
	@After
	public void tearDown(){
		result = null;
		out.println("After");
	}
	
	@Test
	public void testBrutto1() {
		double result = CalculatorBrutto.netSalary(3000);
		assertEquals(2201.30,result,2);
		out.println("TestBrutto1 PASS");
	}
	
	@Test
	public void testBrutto2() {
		double result = CalculatorBrutto.netSalary(112600);
		assertEquals(79470.61,result,2);
		out.println("TestBrutto2 PASS");
	}
	
	@Test
	public void testBrutto3() {
		double result = CalculatorBrutto.netSalary(-10000);
		assertEquals(-6963.86,result,2);
		out.println("TestBrutto3 PASS");
	}
	
	@Test
	public void testBrutto4() {
		double result = CalculatorBrutto.netSalary(0);
		assertEquals(86.26,result,2);
		out.println("TestBrutto3 PASS");
	}

	@Test
	public void testTotalAmountEmployee1() {
		double result = CalculatorBrutto.totalAmountEmployee(2600);
		assertEquals(3132.48,result,2);
		out.println("testTotalAmountEmployee PASS");
	}
	
	@Test
	public void testDidAmountEmployeeIsNotNull() {
		Assert.assertNotNull(CalculatorBrutto.totalAmountEmployee(2600));
		out.println("testDidAmountEmployeeIsNotNull PASS");
	}
	
	@Test
	public void TestDidNetSalaryIsNotNull() {
		Assert.assertNotNull(CalculatorBrutto.netSalary(0000000));
		out.println("TestDidNetSalaryIsNotNull PASS");
	}
	
	@Test
	public void TestDidNetSalaryIsNotNulld() {
		Assert.assertNotNull(CalculatorBrutto.netSalary(-500));
		out.println("testDidAmountEmployeeIsNotNull PASS");
	}
	
	@Test
	public void testTotalAmountEmployee2() {
		double result = CalculatorBrutto.totalAmountEmployee(55600);
		assertEquals(66986.88,result,2);
		out.println("testTotalAmountEmployee PASS");
	}
	
	@Test
	public void testTotalAmountEmployee3() {
		double result = CalculatorBrutto.totalAmountEmployee(-2600);
		assertEquals(-3132.48,result,2);
		out.println("testTotalAmountEmployee PASS");
	}
	
	@Test
	public void testTotalAmountEmployee4() {
		double result = CalculatorBrutto.totalAmountEmployee(0);
		assertEquals(0.00,result,2);
		out.println("testTotalAmountEmployee PASS");
	}
		
}
