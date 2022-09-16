package test;

import java.util.Scanner;
public class factorial {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num= in.nextInt()
;	
		  
		  int number=num , fact=1;  
		  for(int i=1;i<=number;i++){    
		      fact=fact*i;    
		  }    
		  System.out.println("Factorial of "+number+" is: "+fact);    
		
		
	}
	

}
