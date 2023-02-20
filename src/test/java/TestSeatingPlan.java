import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestSeatingPlan {
    @Test
    void testSeatingPlanIsInitWith15Seat() {
        SeatingPlan seatingPlan = new SeatingPlan();
        assertEquals(15, seatingPlan.getSeats().size());
    }

    @Test
    void testSeatingPlanCheckEachSeat() {
        SeatingPlan seatingPlan = new SeatingPlan();
        List<Seat> seats = seatingPlan.getSeats();
        for (int i=0; i<5; i++) {
            assertEquals(Row.A, seats.get(i).getRow());
            assertEquals(i+1, seats.get(i).getSeatNo());
        }
        for (int i=5; i<10; i++) {
            assertEquals(Row.B, seats.get(i).getRow());
            assertEquals((i+1) - 5, seats.get(i).getSeatNo());
        }
        for (int i=10; i<15; i++) {
            assertEquals(Row.C, seats.get(i).getRow());
            assertEquals((i+1) - 10, seats.get(i).getSeatNo());
        }
    }

    @Test
    void testRequest1SeatSuccess() {
        SeatingPlan seatingPlan = new SeatingPlan();
        List<Seat> seats = seatingPlan.requestSeats(1);
        assertEquals(1, seats.size());
        assertEquals(Row.A, seats.get(0).getRow());
        assertEquals(1, seats.get(0).getSeatNo());
        assertTrue(seats.get(0).isAllocated());
    }

    @Test
    void testRequest2SeatSuccess() {
        SeatingPlan seatingPlan = new SeatingPlan();
        List<Seat> seats = seatingPlan.requestSeats(2);
        assertEquals(2, seats.size());
        assertEquals(Row.A, seats.get(0).getRow());
        assertEquals(1, seats.get(0).getSeatNo());
        assertTrue(seats.get(0).isAllocated());

        assertEquals(Row.A, seats.get(1).getRow());
        assertEquals(2, seats.get(1).getSeatNo());
        assertTrue(seats.get(1).isAllocated());
    }

    @Test
    void testRequest3SeatSuccess() {
        SeatingPlan seatingPlan = new SeatingPlan();
        List<Seat> seats = seatingPlan.requestSeats(3);
        assertEquals(3, seats.size());
        assertEquals(Row.A, seats.get(0).getRow());
        assertEquals(1, seats.get(0).getSeatNo());
        assertTrue(seats.get(0).isAllocated());

        assertEquals(Row.A, seats.get(1).getRow());
        assertEquals(2, seats.get(1).getSeatNo());
        assertTrue(seats.get(1).isAllocated());

        assertEquals(Row.A, seats.get(2).getRow());
        assertEquals(3, seats.get(2).getSeatNo());
        assertTrue(seats.get(2).isAllocated());
    }

    @Test
    void testRequestSeatFail() {
        SeatingPlan seatingPlan = new SeatingPlan();
        List<Seat> seats = seatingPlan.requestSeats(13);
        seats = seatingPlan.requestSeats(3);
        assertEquals(0, seats.size());
    }
}
