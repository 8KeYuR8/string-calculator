// Release 2.1
// A different take with the delimeter in focus for the next releases

import java.util.Scanner;

class StringCalculator
{
	public void Add(String numbers)
	{
		numbers = numbers.replaceAll(" ", "");
		int sum = 0;
		for(int i = 0; i < numbers.length(); i++)
		{
			if(numbers.charAt(i) != ',')
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
		String str;
		System.out.println("Enter the numbers :- ");
		str = sc.nextLine();
		StringCalculator strcal = new StringCalculator();
		strcal.Add(str);
	}
}