package bridgelabz;

import java.util.Random;
import java.util.Scanner;

public class Find_number {
	public static void main(String[] args) {
		int number,guess;
		final int max=100;
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		Random rand=new Random();
		boolean correct=false;
		number=rand.nextInt(max);
		while(!correct) {
			System.out.println("guess a number between 1 and 100:");
			guess=sc.nextInt();
			if(guess<number) {
				System.out.println("Too low,try again");
			}else if(guess>number) {
				System.out.println("Too high,try again");
			}else if(guess==number)
				System.out.println("guessed right number");
			correct=true;
		}
		System.exit(0);
	}
}
