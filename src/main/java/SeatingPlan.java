import java.util.ArrayList;
import java.util.List;

public class SeatingPlan {
    private List<Seat> seats;
    // create a seating plan with 15 seat and marked the seat no.
    public SeatingPlan(){
        seats = new ArrayList<>();
        for (int i=0; i<15; i++) {
            seats.add(new Seat(Row.A, i+1));
        }
    }

    // provide function for seating plan to check if there is still enough empty seat to allocate

    // provide function for booking system to mark seat(s) allocated


    public List<Seat> getSeats() {
        return seats;
    }
}
