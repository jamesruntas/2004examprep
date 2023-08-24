package RPS;
public class RPSGame {  
	private Player player1; // first player 
   private Player player2; // second player 
   private int numTies; // number of tied games 
   private Hand hand; // players’ hand (randomly select rock, paper or scissors) 
 
 /** constructs a new RPSGame object. */ 
 public RPSGame(String player1Name, String player2Name) { 
 	hand = new Hand(); 
 	player1 = new Player(player1Name, hand); 
 	player2 = new Player(player2Name, hand); 
 } 
 
 /** plays the specified number of rounds of rock-paper-scissors. */ 
 public void playGame(int rounds) { 
 	numTies = 0; // reset number of ties 
 	player1.resetScore(); // reset player 1’s score 
 	player2.resetScore(); // reset player 2’s score 
 	for (int i = 1; i <= rounds; i++) { 
 		playRound(); 
 		// print the round number, and each player’s name and choice 
 		System.out.println("Round#: " + i); 
 		System.out.println(player1.name() + ": " + player1.choice()); 
 		System.out.println(player2.name() + ": " + player2.choice() + "\n"); 
 	} 
 	printResults(); 
 } 
 
 /** plays one round of the game. */ 
 private void playRound() { 
 	player1.takeTurn(); // player 1 chooses rock, paper or scissors 
 	player2.takeTurn(); // player 2 chooses rock, paper or scissors 
 	if ( player1.choice().equals(player2.choice()) ) { // tie 
 		numTies++; // increment number of ties 
 	} 
 	else if ( player1.choice().beats(player2.choice()) ) { // #1 wins 
 		player1.incrementScore(); // increment player 1’s score 
 	} 
 	else { // #2 wins 
 		player2.incrementScore(); // increment player 2’s score 
 	} 
 } 

 /** print the results. */ 
 private void printResults() { 
 	System.out.println(player1); // prints player 1’s name and score 
 	System.out.println(player2); // prints player 2’s name and score 
 	System.out.println("There was/were " + numTies + " tie(s).\n"); 
 } 



}
