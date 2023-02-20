import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
            assertEquals(i+1, seats.get(i).getSeatNo());
        }
        for (int i=10; i<15; i++) {
            assertEquals(Row.C, seats.get(i).getRow());
            assertEquals(i+1, seats.get(i).getSeatNo());
        }
    }
}
