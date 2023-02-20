import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestSeat {
    @Test
    void testSeatAllocatedIsFalseAtBeginning() {
        Seat seat = new Seat(Row.A, 1);
        assertFalse(seat.isAllocated());
    }

    @Test
    void testSeatAllocatedIsTrueAfterSetAllocatedIsCalled() {
        Seat seat = new Seat(Row.A, 1);
        seat.setAllocated();
        assertTrue(seat.isAllocated());
    }
}

