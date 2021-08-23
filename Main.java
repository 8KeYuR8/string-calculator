// Release 3
// Custom delimeter

import java.util.Scanner;

class StringCalculator
{
	public void Add(String numbers, char del)
	{
		numbers = numbers.replaceAll(" ", "");
		int sum = 0;
		for(int i = 0; i < numbers.length(); i++)
		{
			if(numbers.charAt(i) != ',' && numbers.charAt(i) != del)
			{
				sum += Character.getNumericValue(numbers.charAt(i));
			}
		}
		System.out.println("The sum is " + sum);
	}
}

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the delimeter :- ");
		char delimeter = sc.nextLine().charAt(0);
		System.out.println("Enter the numbers :- ");
		String nums = sc.nextLine();
		StringCalculator strcal = new StringCalculator();
		strcal.Add(nums, delimeter);
	}
}