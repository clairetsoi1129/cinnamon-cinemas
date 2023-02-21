import java.util.ArrayList;
import java.util.List;

public class SeatingPlan {
    private final int TOTAL_SEATS = 15;
    private final int MAX_SEAT_PER_ROW = 5;

    private List<Seat> seats;
    private int sold = 0;
    // create a seating plan with 15 seat and marked the seat no.
    public SeatingPlan(){
        Row[] rows = Row.values();
        seats = new ArrayList<>();
        for (Row row: rows) {
            for (int i = 0; i < MAX_SEAT_PER_ROW; i++) {
                seats.add(new Seat(row, i + 1));
            }
        }
    }

    // provide function for seating plan to check if there is still enough empty seat to allocate
    public List<Seat> requestSeats(int noOfSeats){
        List<Seat> result = new ArrayList<>();
        if (hasSeats(noOfSeats)) {
            for (int i = sold; i < noOfSeats+sold; i++) {
                getSeats().get(i).setAllocated();
                result.add(getSeats().get(i));
            }
            sold += noOfSeats;
        }
        return result;
    }

    // provide function for booking system to mark seat(s) allocated
    private boolean hasSeats(int noOfSeats){
        return noOfSeats+sold<=TOTAL_SEATS;
    }


    public List<Seat> getSeats() {
        return seats;
    }
}
