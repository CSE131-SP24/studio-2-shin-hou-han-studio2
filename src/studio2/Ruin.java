package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		int startAmount = in.nextInt();
		double winChance = in.nextDouble();
		int winLimit = in.nextInt();
		
		System.out.println(startAmount + winChance + winLimit);
		
		double result=0;
		
		while (startAmount>0 && startAmount < winLimit) {
			
			result = Math.random();
			
			if (winChance>=result) {
				startAmount++;
			}
			else {
				startAmount--;
			}
			
			
		}
		if (startAmount == winLimit) {
			System.out.println("You win!!!!! :))");
			
		}
		else if (startAmount == 0) {
			System.out.println("You Lose!");
		}
	}

}
