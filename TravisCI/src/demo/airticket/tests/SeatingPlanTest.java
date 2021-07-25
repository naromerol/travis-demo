/**
 * 
 */
package nestor.romero.airticket.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.cc.airline.ticketing.SeatingPlan;

/**
 * COMP311 - A6 JUnit
 * @author Nestor Romero Leon - 301133331
 *
 */
public class SeatingPlanTest {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		System.out.println("Starting test of the SeatingPlan default constructor");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		System.out.println("Test of the SeatingPlan default constructor complete");
	}

	/**
	 * Test method for {@link com.cc.airline.ticketing.SeatingPlan#SeatingPlan()}.
	 */
	@Test
	public void testSeatingPlan() {
		SeatingPlan sp = new SeatingPlan();
		
		assertNotNull(sp);
		
		assertEquals(sp.getNumBusSeats(), 2);
		assertEquals(sp.getTotalRows(),4);
		
		assertEquals(sp.getSeats().size(), 14);
		assertEquals(sp.getTotalSeats(),14);
		
		assertNotNull(sp.getSeatReserver());
		
	}

}
