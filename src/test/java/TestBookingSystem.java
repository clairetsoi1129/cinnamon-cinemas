import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.lenient;

public class TestBookingSystem {
    @Mock
    RandomSeats random;

    @BeforeEach
    public void setUp() {
        random = Mockito.mock(RandomSeats.class);
    }
    @Test
    void testRequest3Tickets5TimesOutput() {
        lenient().when(random.random(1,4)).thenReturn(3);
        BookingSystem bookingSystem = new BookingSystem();
        Customer customer = new Customer("James", random);
        Ticket ticket = bookingSystem.requestSeats(customer);
        assertEquals("James requests 3 seats: A1, A2, A3", ticket.toString());
        ticket = bookingSystem.requestSeats(customer);
        assertEquals("James requests 3 seats: A4, A5, B1", ticket.toString());
        ticket = bookingSystem.requestSeats(customer);
        assertEquals("James requests 3 seats: B2, B3, B4", ticket.toString());
        ticket = bookingSystem.requestSeats(customer);
        assertEquals("James requests 3 seats: B5, C1, C2", ticket.toString());
        ticket = bookingSystem.requestSeats(customer);
        assertEquals("James requests 3 seats: C3, C4, C5", ticket.toString());
    }
    @Test
    void testRequest2Tickets8TimesOutput() {
        lenient().when(random.random(1,4)).thenReturn(2);
        BookingSystem bookingSystem = new BookingSystem();
        Customer customer = new Customer("James", random);
        Ticket ticket = bookingSystem.requestSeats(customer);
        assertEquals("James requests 2 seats: A1, A2", ticket.toString());
        ticket = bookingSystem.requestSeats(customer);
        assertEquals("James requests 2 seats: A3, A4", ticket.toString());
        ticket = bookingSystem.requestSeats(customer);
        assertEquals("James requests 2 seats: A5, B1", ticket.toString());
        ticket = bookingSystem.requestSeats(customer);
        assertEquals("James requests 2 seats: B2, B3", ticket.toString());
        ticket = bookingSystem.requestSeats(customer);
        assertEquals("James requests 2 seats: B4, B5", ticket.toString());
        ticket = bookingSystem.requestSeats(customer);
        assertEquals("James requests 2 seats: C1, C2", ticket.toString());
        ticket = bookingSystem.requestSeats(customer);
        assertEquals("James requests 2 seats: C3, C4", ticket.toString());
        ticket = bookingSystem.requestSeats(customer);
        assertNull(ticket);
        assertEquals("James requests 2 seats:", customer.toString());
    }
}
