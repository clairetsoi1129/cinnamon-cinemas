import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSeatingPlan {
    @Test
    void testSeatingPlanIsInitWith15Seat() {
        SeatingPlan seatingPlan = new SeatingPlan();
        assertEquals(15, seatingPlan.getSeats().size());
    }
}
