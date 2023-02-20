import java.util.List;

public class Ticket {
    private Customer customer;
    private List<Seat> seats;

    public Ticket(Customer customer, List<Seat> seats) {
        this.customer = customer;
        this.seats = seats;
    }

    public String toString(){
        StringBuilder msg = new StringBuilder(customer.toString());
        for (Seat seat : seats) {
            msg.append(" %s%d,".formatted(seat.getRow(), seat.getSeatNo()));
        }
        return msg.substring(0, msg.length()-1);
    }
}
