import java.util.*;
public class RockPaperScissors {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		 while(true){
String[] rps = {"r","p","s"};
String computerMove = rps[new Random().nextInt(rps.length)];
String playerMove;
while(true) {
System.out.println("\nPlease enter your move (r,p or s)");
 playerMove = sc.nextLine();
 
 if(playerMove.equals("r") || (playerMove.equals("p")) || (playerMove.equals("s")) ) {
	 break;
}		// break;


System.out.println(playerMove + "is not a valid move.");
	}
System.out.println("Computer played:" + computerMove);

if(playerMove.equals(computerMove)) {
	System.out.println("The game is a tie!");
}
else if(playerMove.equals("r")) {
	
		if(computerMove.equals("p")) {
			System.out.println("You lose! Paper beats Rock!");
		}
		else if(computerMove.equals("s")) {
			System.out.println("You win! Rock beats Scissors!");
		}
	}
else if(playerMove.equals("p")) {
	
	if(computerMove.equals("r")) {
		System.out.println("You win! Paper beats Rock! ");
	}
	else if(computerMove.equals("s")) {
		System.out.println("You lose! Scissors beats Paper!");
	}
}
else if(playerMove.equals("s")) {
	
	if(computerMove.equals("p")) {
		System.out.println("You win! Scissors beat Paper!");
	}
	else if(computerMove.equals("r")) {
		System.out.println("You lose! Rock beats Scissors!");
	}
}


	}
		 
	}

}
