package Overloads;

import java.util.Scanner;

public class overload {
	
	public static void main(String[] args) {
		
		System.out.println("This will add anywhere from 2 - 4 numbers. Examples:\n");
		System.out.printf("2 + 3 = %d%n",add(2,3));
		System.out.printf("3 + 3 + 7 = %d%n",add(3,3,7));
		System.out.printf("4 + 6 + 9 + 2 = %d%n",add(4,6,9,2));	
		
		int numInput = howMany();
		
		if (numInput == 2) {
			int x = number();
			int y = number();
			System.out.printf("%d + %d = %d%n", x, y, add(x,y));	
		} else if (numInput == 3) {
			int x = number();
			int y = number();
			int n = number();
			System.out.printf("%d + %d + %d = %d%n", x, y, n, add(x,y,n));		
		}else if (numInput == 4) {
			int x = number();
			int y = number();
			int n = number();
			int j = number();
			System.out.printf("%d + %d + %d + %d = %d%n", x, y, n, j, add(x,y,n,j));		
		}
	}
	
	public static int howMany(){
		
		System.out.println("How many numbers (2,3 or 4) would you like to add?");
		Scanner sc= new Scanner(System.in);    
		int no = sc.nextInt();
			
		return no;
	}
	
	public static int add(int x, int y) {
		int result = x + y;
		return result;	
	}
	
	public static int add(int x, int y, int n) {
		int result = x + y + n;
		return result;		
	}
	
	public static int add(int x, int y, int n, int j) {
		int result = x + y + n + j;
		return result;	
	}
	
	public static int number() {
		
		System.out.println("Enter Number:");
		Scanner sc= new Scanner(System.in);    
		int no = sc.nextInt();
		
		return no;
	}

}
