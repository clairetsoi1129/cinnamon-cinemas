import java.util.ArrayList;
import java.util.List;

public class SeatingPlan {
    private List<Seat> seats;
    private int sold = 0;
    // create a seating plan with 15 seat and marked the seat no.
    public SeatingPlan(){
        seats = new ArrayList<>();
        for (int i=0; i<5; i++) {
            seats.add(new Seat(Row.A, i+1));
        }
        for (int i=5; i<10; i++) {
            seats.add(new Seat(Row.B, i+1));
        }
        for (int i=10; i<15; i++) {
            seats.add(new Seat(Row.C, i+1));
        }
    }

    // provide function for seating plan to check if there is still enough empty seat to allocate
    public List<Seat> requestSeats(int noOfSeats){
        List<Seat> result = new ArrayList<>();
        for (int i=sold; i<noOfSeats; i++){
            getSeats().get(i).setAllocated();;
            result.add(getSeats().get(i));
        }
        sold += noOfSeats;

        return result;
    }

    // provide function for booking system to mark seat(s) allocated


    public List<Seat> getSeats() {
        return seats;
    }
}
