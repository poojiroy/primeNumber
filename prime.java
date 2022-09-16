package test;
import java.util.Scanner;

public class prime {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		if(number%2==1) {
			System.out.println("It's a prime");
		}
		else {
			System.out.println("Not a prime");
		}
		input.close();
		
	}
	
	

}
