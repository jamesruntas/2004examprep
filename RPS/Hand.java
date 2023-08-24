package RPS;
import java.util.Random;

public class Hand {
    Random r;

    public Hand(){
        this.r = new Random();

    }

    public int chose(){
        return r.nextInt(3);

    }

    
}
