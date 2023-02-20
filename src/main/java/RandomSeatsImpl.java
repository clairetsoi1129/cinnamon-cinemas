import java.security.SecureRandom;

public class RandomSeatsImpl implements RandomSeats{
    public int random(int min, int max){
        return new SecureRandom().nextInt(min, max);
    }
}
