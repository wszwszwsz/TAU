import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
 

@RunWith(MockitoJUnitRunner.class)
public class DatabaseNetworkTest 
{
	
    @InjectMocks
    RecordService recordService;
     
    @Mock
    Database databaseMock;
     
    @Mock
    Network networkMock;

    @Test
    public void saveDatabaseTest()
    {
        boolean saved = recordService.save("temp.txt");
        assertEquals(true, saved);
         
        verify(databaseMock, times(1)).save("temp.txt");
       
    }
    
    @Test
    public void saveNetworkTest()
    {
        boolean saved = recordService.save("temp.txt");
        assertEquals(true, saved);
         
    	 verify(networkMock, times(1)).save("temp.txt");
    }
    
	@Test
	public void speedInternetTest11() {
		Network example = new Network();
		int CalculateNetwork = example.CalculateNetwork();
		assertEquals(20, CalculateNetwork);
		System.out.println("SPEED OK!");
	}
	
	@Test
	public void speedInternetTest112() {
		Network example = new Network();
		double CalculateHighNetwork = example.CalculateHighNetwork();
		assertEquals(89.90, CalculateHighNetwork, 0.1);
		System.out.println("Hihg SPEED OK!");
	}   

	@Test
	public void speedInternetTest113() {
		Network example = mock(Network.class);
		when(example.CalculateNetwork()).thenReturn(20);
		int b = example.CalculateNetwork();
		assertEquals(20, b);
	}
	
	@Test
	public void speedInternetTest114() {
		Network example = mock(Network.class);
		when(example.CalculateNetwork()).thenReturn(100);
		int b = example.CalculateNetwork();
		assertEquals(100, b);
	}
    
    
    
}