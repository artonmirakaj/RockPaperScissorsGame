
import java.util.*;

public class RockPaperScissors {

	public static void main(String args[]) {

		boolean finish = true;
		System.out.println("\nR = Rock P = Paper S = Scissors\n");
		System.out.println("W = Win L = Loss T = Tie\n");
		System.out.println("The Game will stop until you win\n");

		do {
			String player1;
			String player2 = null;
			int cInt;
			String response;
			Scanner scan = new Scanner(System.in);
			Random gen = new Random();
			cInt = gen.nextInt(3) + 1;

			if (cInt == 1) {
				player2 = "R";
			}

			else if (cInt == 2) {
				player2 = "P";
			}

			else if (cInt == 3) {
				player2 = "S";
			}

			System.out.println("Player1: ");
			player1 = scan.next();
			gen.nextInt();
			player1 = player1.toUpperCase();
			System.out.println("Player2: " + player2);

			if (player1.equals(player2)) {
				System.out.println("T");
				finish = false;
			}

			else if (player1.equals("R")) {
				if (player2.equals("S")) {
					System.out.println("W");
					finish = true;
				} else if (player2.equals("P")) {
					System.out.println("L");
					finish = false;
				}
			}

			else if (player1.equals("P")) {
				if (player2.equals("S")) {
					System.out.println("L");
					finish = false;
				} else if (player2.equals("R")) {
					System.out.println("W");
					finish = true;
				}
			}

			else if (player1.equals("S")) {
				if (player2.equals("P")) {
					System.out.println("W");
					finish = true;
				} else if (player2.equals("R")) {
					System.out.println("L");
					finish = false;
				}
			}

			else {
				System.out.println("Invalid user input.");
			}
		} 
		
		while (finish == false);

	}

}
