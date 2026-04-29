import java.util.Scanner;

public class WesamMakhoul
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		int correctNumber = 16;
		int guessCounter = 0;

		System.out.print("Choose a number between 10 and 20: \n");
		int guess = input.nextInt();

		while(guess != correctNumber && guessCounter < 3)
		{
			if(guess < correctNumber)
			{
				System.out.print("Incorrect. Guess higher!!!\n");
				guessCounter++;
			}
			else if(guess > correctNumber)
                        {
                                System.out.print("Incorrect. Guess Lower!!!\n");
                                guessCounter++;
                        }

			System.out.print("Choose a number between 10 and 20: \n");
                	guess = input.nextInt();
		}

		if(guessCounter >= 3)
			System.out.print("You have failed to guess the correct number\n");
		else
			System.out.print("CONGRATS, You have guess the correct number\n");
	}
}
