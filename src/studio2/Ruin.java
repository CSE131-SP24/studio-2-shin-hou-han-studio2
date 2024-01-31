package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		int startAmount = in.nextInt();
		double winChance = in.nextDouble();
		int winLimit = in.nextInt();
		int totalSimulations = in.nextInt();
		
		System.out.println(startAmount + winChance + winLimit);
		
		double result=0;
		for (int simulations = 0; simulations < totalSimulations; simulations++) {
			int plays = 0;
			int amt = startAmount;
			while (amt>0 && amt < winLimit) {
				result = Math.random();
					plays++;
				if (winChance>=result) {
					amt++;
				}
				else {
					amt--;
				}

				if (amt == winLimit) {
					System.out.println("Day " + simulations + ": " + plays + " plays. You won!!! :)))))");
					
				}
				else if (amt == 0) {
					System.out.println("Day " + simulations + ": " + plays + " plays. You lose. :(((");
				}
				
			}
		}
	}

}
