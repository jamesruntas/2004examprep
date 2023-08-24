package RPS;

public class RPS {

    private final int ROCK = 0;
    private final int PAPER = 1;
    private final int SCISSORS = 2;
    private final int UNDEFINED = 3;

    private int choice;


    public RPS(){
        this.choice = UNDEFINED;
    }

    public void setChoice(Hand hand){
       this.choice = hand.chose();

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RPS)) return false;
        RPS rps = (RPS) o;
        return choice == rps.choice;
    }

    public boolean beats (RPS r){
        if (this.choice == SCISSORS){
            if (r.choice == PAPER){return true;}
            return false;
        }
        else if (this.choice == PAPER){
            if (r.choice == SCISSORS){return false;}
            return true;
        }
        else {
            if(r.choice == SCISSORS){return true;}
            return false;
        }

    }
    
    @Override 
    public String toString(){
        switch (choice) {
            case ROCK:
                return "ROCK";
            case PAPER:
                return "PAPER";
            case SCISSORS:
                return "SCISSORS";
            default:
                return "UNDEFINED";
        }

    }
    
}
