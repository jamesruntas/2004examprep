package RPS;

public class Player {
    public String name;
    private RPS choice;
    private Hand hand;
    private int score;

    public Player(String name, Hand hand){
        this.hand = hand;
        this.name = name;
        this.choice = new RPS();
        this.score = 0;
    }

    public void takeTurn(){
        choice.setChoice(hand);
    }

    public String name(){
        return this.name;

    }

    public RPS choice(){
        return this.choice;

    }

    public int score(){
        return this.score;

    }   
    
    public void incrementScore(){
        score+=1;

    }

    public void resetScore(){
        this.score = 0;

    }

    @Override
    public String toString(){
        return name + " won " + score + " game(s).";
    }
    
}
