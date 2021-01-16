import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.BDDMockito.*;
import org.junit.*;


public class MockTest {
	private int a, b;
	
	@Test
	public void example() {
		Mock example = new Mock();
		a = example.a();
		assertEquals(0, a);
	}
	
	@Test
	public void example2() {
		Mock example = mock(Mock.class);
		b = example.b();
		assertEquals(0, b);
	}
	
	@Test
	public void example3() {
		Mock example = mock(Mock.class);
		when(example.b()).thenReturn(2);
		b = example.b();
		assertEquals(2, b);
	}
	
	@Test
	public void example4() {
		Mock example = mock(Mock.class);
		given(example.b()).willReturn(1);
		b = example.b();
		assertEquals(1, b);
	}
}