import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.lenient;

public class TestCustomer {
    @Mock
    RandomSeats random;

    @BeforeEach
    void init() {
        random = Mockito.mock(RandomSeats.class);
        lenient().when(random.random(1,3)).thenReturn(2);
    }

    @Test
    void testCustomerRequestNoOfTicket() {
        Customer customer = new Customer("James", random);
        assertEquals(2,customer.requestTickets());
    }
}
