package Lotto;

import java.util.Scanner;

public class lotto {
	
	public static void main(String[] args) {
		
		String endgame = "Better luck next time!";
		
		System.out.println("Let's play!\n You get 5 guesses to beat me....");
		
		for(int trys =0; trys <=4; trys = trys+1) {
			
			int guess = getGuess();
			int total = lottoGenerator();
			System.out.printf("Total: %d, Your Guess: %d", total, guess);
			boolean res = checkGuess(guess,total);
			if(res == true) {
				System.out.println("\nYES!!!!!!!");
				endgame = "You're a winner!";
				break;
			} else {
				System.out.println("\nNO!!!!!!!");
			}
		}	
		System.out.printf("Thanks for playing!%n%s", endgame);			
	}
	
	public static int getRandomNumber(int min, int max) {
	    return (int) ((Math.random() * (max - min)) + min);
	}
	
	public static int getGuess() {
		System.out.println("Enter your guess (1-27):");
		Scanner input = new Scanner(System.in);
		int guess = input.nextInt();
		
		return guess;	
	}
	
	public static boolean checkGuess(int guess, int total) {
		
		if (guess == total) {
			return true;
		}
		return false;	
	}
	
	public static int lottoGenerator() {
		
		int total = 0;
		int[] array = new int[3];
		for (int x:array) {
			array[x]= getRandomNumber(1,9);
			System.out.println(array[x]);
			total = total + array[x];
		}
		
		return total;	
	}
}
