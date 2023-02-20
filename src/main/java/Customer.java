import java.text.MessageFormat;

public class Customer {
    private String name;
    private RandomSeats randomSeats;

    private int requestNoOfTicket;

    public Customer(String name, RandomSeats randomSeats){
        this.name = name;
        this.randomSeats = randomSeats;
        requestTickets();
    }

    private void requestTickets() {
        requestNoOfTicket = randomSeats.random(1,4);
    }

    public String getName() {
        return name;
    }

    public int getRequestNoOfTicket() {
        return requestNoOfTicket;
    }

    public String toString(){
        return MessageFormat.format("{0} requests {1} seats:",
                this.getName(), this.getRequestNoOfTicket());
    }
}
