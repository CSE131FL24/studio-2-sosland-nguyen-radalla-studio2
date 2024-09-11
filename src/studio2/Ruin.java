package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		try  (Scanner in = new Scanner(System.in)) {
			System.out.println("Start Amount: ");
			int startAmount = in.nextInt();
			System.out.println("Win Chance: ");
			int winChance = in.nextInt();
			System.out.println("Win Limit: ");
			int winLimit = in.nextInt();
			
			while ( startAmount <= winLimit || (startAmount <= 0))  {
				double x = ((Math.random() * 100) + 1);
			if (x <= winChance) {
				startAmount++;
				System.out.println("WIN");
			}
			else {
				startAmount--;
				System.out.println("LOSE");
			

					}	
			
			}
		}
	}
}