// Java Program to Check whether Number is Divisible by Integer range 0-9
import java.util.Scanner;

public class divisible {

	private static Scanner sc;
	public static void main(String[] args) 
	{
		int number;
		sc = new Scanner(System.in);
		
		System.out.print(" Please Enter any Number to Check whether it is Divisible by Integer range 0-9: ");
		number = sc.nextInt();	
		
		if(number % 1 == 0) 
		{
			System.out.println("\n Given number " + number + " is Divisible by 1 because the answer is the number itself "); 
		}
		if(number % 2 == 0) 
		{
			System.out.println("\n Given number " + number + " is Divisible by 2 because it ends with zero or it is an even number "); 
		}
		if(number % 3 == 0) 
		{
			System.out.println("\n Given number " + number + " is Divisible by 3 because the sum of its digits is also divisible by 3 "); 
		}
		if(number % 4 == 0) 
		{
			System.out.println("\n Given number " + number + " is Divisible by 4 because  the last two digits of the number are zeros or they form a number that is divisible by 4 "); 
		}
		if(number % 5 == 0) 
		{
			System.out.println("\n Given number " + number + " is Divisible by 5 because it ends with a 0 or 5"); 
		}
		if(number % 6 == 0) 
		{
			System.out.println("\n Given number " + number + " is Divisible by 6 because it is an even number AND the sum of its digits is divisible by 3 "); 
		}
		if(number % 7 == 0) 
		{
			System.out.println("\n Given number " + number + " is Divisible by 7 because doubling the last digit of the number and then subtracting it from the remaining number, the result is zero or divisible by 7 "); 
		}
		if(number % 8 == 0) 
		{
			System.out.println("\n Given number " + number + " is Divisible by 8 because the number formed by the last three individual digits is divisible by 8 "); 
		}
		if(number % 9 == 0) 
		{
			System.out.println("\n Given number " + number + " is Divisible by 9 because the sum of the digits are evenly divisible by 9 "); 
		}	
	}
}