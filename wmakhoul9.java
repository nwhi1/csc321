//Wesam Makhoul
//csc 321
//Lab #9

import java.util.Scanner;
import java.util.Random;

public class wmakhoul
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		Random rand = new Random();

		System.out.print("Guess a number between 1 and 20: ");
		int guess = input.nextInt();
		int randomNum = rand.nextInt(1,21);

		if(guess < randomNum || guess > randomNum)
		{
			System.out.print("Guess again: ");
			guess = input.nextInt();

			if(guess != randomNum)
			{
				if(guess > randomNum)	
					System.out.printf("You have lost and your guess was higher than the correct number %d\n", randomNum);
				else
					 System.out.printf("You have lost and your guess was lower than the correct number %d\n", randomNum);
			}
		}
		if(guess == randomNum)
		{
			for(int i = 0 ; i < guess ; i++)
				System.out.println("You won and guessed the correct number");
		}
	}
}
