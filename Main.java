// Release 4
// Ignoring numbers bigger than 1000

import java.util.Scanner;

class StringCalculator
{
	public void Add(String numbers, char del)
	{
		numbers = numbers.replaceAll(" ", "");
		int inum, sum = 0;
		String num = "";
		for(int i = 0; i < numbers.length(); i++)
		{
			if(i == numbers.length() - 1)
			{
				num += numbers.charAt(i);
				inum = Integer.parseInt(num);
				if(inum <= 1000)
				{
					sum += inum;
				}
			}
			else if(numbers.charAt(i) != ',' && numbers.charAt(i) != del)
			{
				num += numbers.charAt(i);
			}
			else
			{
				inum = Integer.parseInt(num);
				if(inum <= 1000)
				{
					sum += inum;
				}
				num = "";
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