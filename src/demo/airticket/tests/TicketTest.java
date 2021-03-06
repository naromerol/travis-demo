package demo.airticket.tests;

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
 * COMP311 - Github + Travis
 * 
 * Hitesh Dharmadhikari		301150694
 * Nestor Romero Leon		301133331
 * Tanisha Sharma			301144152
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
	
}
