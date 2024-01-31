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
		int wins = 0;
		int losses = 0;
		double ruinRate = 0;
		double expectedRuin = 0;
		
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
					wins++;
				}
				else if (amt == 0) {
					System.out.println("Day " + simulations + ": " + plays + " plays. You lose. :(((");
					losses++;
				}
				
			}
		}
		ruinRate = (double)losses/totalSimulations;
		System.out.println("Losses: " + losses + "Simulations: " + totalSimulations);
		System.out.println("Experimental Ruin Rate: " + ruinRate);
		double alpha = (1-winChance/winChance);
		if(winChance==0.5){
			expectedRuin = 1-((double)startAmount/(double)winLimit);
		}
		else {
			expectedRuin = (double)(Math.pow(alpha, startAmount) - Math.pow(alpha, winLimit))/(1-Math.pow(alpha,winLimit));
		}
		System.out.println("Expected Ruin Rate: " + expectedRuin);
		
	}

}
