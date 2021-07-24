package nestor.romero.airticket.tests;

import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.cc.airline.passengers.Passenger;
import com.cc.airline.passengers.PassengerName;
import com.cc.airline.ticketing.Seat;
import com.cc.airline.ticketing.SeatingClass;
import com.cc.airline.ticketing.Ticket;

/**
 * COMP311 - A6 JUnit
 * @author Nestor Romero Leon - 301133331
 *
 */
public class TicketTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testTicketConstructor() {
		
		Passenger passenger = new Passenger(new PassengerName("Bruce", "Wayne"));
		
		Seat seat = new Seat();
		seat.setRow(2);
		seat.setLetter('B');
		
		Ticket ticket = new Ticket(passenger,seat, SeatingClass.ECONOMY.getPrice());
		
		assertTrue(ticket.getTicketNo() > 1000000);
	}
	
	@Test
	public void testTicketBad() throws Exception {
		assertThrows(IllegalArgumentException.class, ()->{
			Ticket ticket = new Ticket(null,null,-100.0);
		});
	}
	
	

}
