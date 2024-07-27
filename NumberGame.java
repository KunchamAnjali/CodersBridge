package codersBridge;

import java.util.Scanner;

public class NumberGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int chances=8;
		int finals=0;
		boolean playAgain=true;
		System.out.println("Welcome Buddy");
		System.out.println("Hey Buddy you have about"+chances+"to win the game");
		while(playAgain) {
			int rand=getrandN(1,100);
			boolean guess=false;
			for(int i=0;i<chances;i++) {
				System.out.println("chance"+(i+1)+"Enter your guess:");
				int user=sc.nextInt();
				if(user==rand) {
					guess=true;
					finals+=1;
					System.out.println("You won it.");
					break;
				}
				else if(user>rand) {
					System.out.println("Too High");
				}
				else {
					System.out.println("Too Low");
				}
			}
			if(guess=false) {
				System.out.println();
			}
			System.out.println("Do you want to play Again(y/n)");
			String pa=sc.next();
			playAgain=pa.equalsIgnoreCase("y");
			
		}
		System.out.println("That's it Buddy,Hope you enjoyed it");
		System.out.println("Here is youe Score"+finals);
    sc.close();
	}
	public static int getrandN(int min,int max) {
		return (int)(Math.random()*(max-min+1)+min);
		
	}

}
