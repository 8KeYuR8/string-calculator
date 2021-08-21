// Release 1
// Take upto 2 numbers from user as string and display the sum

import java.util.Scanner;

class StringCalculator
{
	public void Add(String numbers)
	{
		numbers = numbers.replaceAll(" ", "");   // Removes spaces
		if(numbers.length() == 0)
		{
			System.out.println("The sum is 0");
		}
		else if(numbers.length() == 1)
		{
			System.out.println("The sum is " + numbers);
		}
		else
		{
			System.out.println("The sum is " + (Character.getNumericValue(numbers.charAt(0)) + Character.getNumericValue(numbers.charAt(2))));   // Assuming that there's a comma in between the two numbers
		}
	}
}

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String str;
		System.out.println("Enter the numbers :- ");
		str = sc.nextLine();
		StringCalculator strcal = new StringCalculator();
		strcal.Add(str);
	}
}