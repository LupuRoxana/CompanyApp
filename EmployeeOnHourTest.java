package Company;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class EmployeeOnHourTest {

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
		
		System.out.println("Employee on hour test begin!");
		
		EmployeeOnHour e = new EmployeeOnHour("Ionescu","1234", 5.0, 20);
		double output = e.getSum();		
		assertEquals(100.0, output, 0.001);
		
	}

}
