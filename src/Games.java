import java.util.Scanner;


public class Games {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int computerNum;
		String userPlay;
		String computerPlay="";
		int win=0;
		int lose=0;
		int tie=0;
		int count=0;
		
		Scanner input = new Scanner (System.in);
		
		do {
		computerNum= 1 + (int) (Math.random()*3);
	
		System.out.println ("Please enter your choice: R for Rock, P for Paper and S for Scissors");
		
		userPlay= input.next();
		switch (computerNum) {
		case 1: computerPlay="R";
		break;
		case 2: computerPlay="P";
		break;
		case 3: computerPlay="S";;
		break;
	}
		System.out.println ("The computer play is "+computerPlay);
		
		if (userPlay.equals(computerPlay)) {
			System.out.println ("The result is a tie");
			tie++;
		}
			else {
				if ((computerPlay=="R" && userPlay=="P") || (computerPlay=="P" && userPlay=="S") || (computerPlay=="S" && userPlay=="R")) {
					System.out.println ("Player won");	
					win++;
				}
				
				else if ((computerPlay=="R" && userPlay=="S") || (computerPlay=="P" && userPlay=="R") || (computerPlay=="S" && userPlay=="P")) {
					System.out.println ("Computer won");
					lose++;
				}
				
			}
					
		count++;
		}
		while (count<10);
		
		System.out.println("You won " + win + " times");
		System.out.println("You lost " + lose + " times");
		System.out.println("We tie " + tie + " times");
		System.out.println("We played " + count + " times");

	}

}
