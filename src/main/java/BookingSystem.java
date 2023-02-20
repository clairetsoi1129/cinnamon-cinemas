import java.util.List;

public class BookingSystem {
    private SeatingPlan seatingPlan;


    public BookingSystem(){
        seatingPlan = new SeatingPlan();
    }

    public Ticket requestSeats(Customer customer){
        List<Seat> seats = seatingPlan.requestSeats(customer.getRequestNoOfTicket());
        if (seats != null && seats.size()>0)
            return new Ticket(customer, seats);
        else
            return null;
    }

    public static void main(String[] args){
        // 1. init the seating plan
        // 2. show the welcome message
        // 3. ask the customer name
        // 4. generate the random seat request
        // 5. if seating plan still have space, print the seat allocated, and then go to 3 again
        // 6. else end the program
        BookingSystem bookingSystem = new BookingSystem();

        System.out.println("Welcome to Cinnamon Cinemas Movie Theatre!");
        boolean hasSeat = true;
        RandomSeats randomSeats = new RandomSeatsImpl();
        for (int i=1; hasSeat; i++){
            Customer customer = new Customer("Customer"+i, randomSeats);
            Ticket ticket = bookingSystem.requestSeats(customer);
            if (ticket != null) {
                System.out.println(ticket);
            }else{
                hasSeat = false;
                System.out.println(customer + " Not enough seats available.");
            }
        }
    }
}
