public class Customer {
    private String name;
    private RandomSeats randomSeats;

    public Customer(String name, RandomSeats randomSeats){
        this.name = name;
        this.randomSeats = randomSeats;
    }

    public int requestTickets() {
        return randomSeats.random(1,3);
    }
}
