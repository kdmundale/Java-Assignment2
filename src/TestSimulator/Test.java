package TestSimulator;

import java.util.Scanner;

public class Test {
	
	int counter = 0;
	
	public static void main(String[] args) {
		
		int score = 0;
		
		for(int x = 1; x <=5; x=x+1) {
			simulateQuestion(x);
			int reply = inputAnswer();
			boolean res = checkAnswer(x, reply);
			if(res == true) {
				score = score + 1;
			} 
			generateMessage(res);
			
		}
		double perc = score * 100/ 5;
		System.out.println("All done!");
		System.out.printf("You got %d right out of 5!%n%.2f %%", score, perc);
				
	}
	
	public static void simulateQuestion(int num) {
		
		System.out.println("Chose the number to the correct answer.");
		System.out.println("");
		
		String[] questions = new String[5];
		questions[0]="What color is the sky?";
		questions[1]="How many arms does an octopus have?";
		questions[2]="What is 6 to the power of 6?";
		questions[3]="Do pigs fly?";
		questions[4]="If it looks like a duck, quacks like a duck, and walks like a duck.... is it, in fact, a duck?";
		
		String[] choices1 = new String[3];
		choices1[0]= "1. Blue";
		choices1[1]="2. Red";
		choices1[2]="3. Pink";
		
		String[] choices2 = new String[3];
		choices2[0]= "1. 7";
		choices2[1]="2. 13";
		choices2[2]="3. 8";
		
		String[] choices3 = new String[3];
		choices3[0]= "1. 318";
		choices3[1]="2. 216";
		choices3[2]="3. 156";
		
		String[] choices4 = new String[3];
		choices4[0]= "1. Yes";
		choices4[1]="2. Maybe";
		choices4[2]="3. Nope";
		
		String[] choices5 = new String[3];
		choices5[0]= "1. Absolutely";
		choices5[1]="2. Possibly, need more evidence";
		choices5[2]="3. Definately not";
		
		if(num==1) {
			System.out.println(questions[0]);
			for(String x: choices1) {
				System.out.println(x);
			}
		} else if (num == 2) {
			System.out.println(questions[1]);
			for(String x: choices2) {
				System.out.println(x);
			}
		} else if (num == 3) {
			System.out.println(questions[2]);
			for(String x: choices3) {
				System.out.println(x);
			}
		} else if (num == 4) {
			System.out.println(questions[3]);
			for(String x: choices4) {
				System.out.println(x);
			}
		} else if (num == 5) {
			System.out.println(questions[4]);
			for(String x: choices5) {
				System.out.println(x);
			}
		}
		
	}
	
	public static boolean checkAnswer(int ques, int ans) {
		
		boolean answer = true;
		
		if(ques == 1 && ans != 1) {
			answer= false;
		}else if (ques == 2 && ans != 3) {
			answer = false;
		}else if (ques == 3 && ans != 2) {
			answer = false;
		}else if (ques == 4 && ans != 3) {
			answer = false;
		}else if (ques == 5 && ans != 2) {
			answer = false;
		}

		return answer;
			
	}
	
	public static int getRandomNumber(int min, int max) {
		
	    return (int) ((Math.random() * (max - min)) + min);
	}

	public static void generateMessage(boolean x){
		
		String res = null;
		String response = null;
		int y = getRandomNumber(0,3);
		
		String[] correct = new String[4];
		String[] incorrect = new String[4];
		
		correct[0]="Excellent!";
		correct[1]="Good!";
		correct[2]="Keep up the good work!";
		correct[3]="Nice work!";
		
		incorrect[0]="No, please try again!";
		incorrect[1]="Wrong. Try again!";
		incorrect[2]="Incorrect. Don't give up!";
		incorrect[3]="Nope, keep tryng!";
		
		if (x==true) {
			res="yes";
		} else {
			res ="no";
		}
		
		switch(res) {	
		case "yes": response = correct[y];
			break;
		case "no": response = incorrect[y];
			break;	
		}
		System.out.println(response);
	}
	
	public static int inputAnswer() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Answer:");
		int ans = input.nextInt();
		
		return ans;
		
	}
	
	
}
