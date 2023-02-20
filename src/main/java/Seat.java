public class Seat {
    private boolean allocated;
    private Row row;
    private int seatNo;

    // initialze to seat allocated to false at the beginning of the program
    public Seat(Row row, int seatNo){
        allocated = false;
        this.row = row;
        this.seatNo = seatNo;
    }

    // provide function to set seat allocated
    public boolean isAllocated() {
        return allocated;
    }

    public void setAllocated() {
        this.allocated = true;
    }

    public Row getRow() {
        return row;
    }

    public int getSeatNo() {
        return seatNo;
    }
}
