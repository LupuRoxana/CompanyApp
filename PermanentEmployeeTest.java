package Company;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PermanentEmployeeTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetSum() {
		System.out.println("The test begin!");
		
		PermanentEmployee pe = new PermanentEmployee("Lupu", "1234", 1000.0);
		
		double output = pe.getSum();
		assertEquals(1000.0, output, 0.00001);
	}

	@Test
	public void testToString() {
		 
		System.out.println("Another test begin!");
		
		PermanentEmployee per = new PermanentEmployee("Popescu", "45676", 500.0);
		String output = per.toString();
		String expected = "Permanent Employee: " + 500.0;
		assertEquals(expected, output);
	}

}
