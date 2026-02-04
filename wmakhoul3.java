import java.util.Scanner;

public class wmakhoul1
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.println("whats your favorite food: \n1.Tacos\n2.Shawrma\n3.Burgers\n4.Pasta");

		System.out.println("Enter your choice:");
		int choice = input.nextInt();


		switch(choice)
		{
			case 1: 
				System.out.println("You chose Tacos. Good choice");
				break;
			case 2: 
				System.out.println("You chose Shawrma. Good choice");
				break;
			case 3: 
				System.out.println("You chose Burgers. Good choice");
				break;
			default:
			       	System.out.println("You chose Pasta. Good choice");
		}

		input.close();
	}
}
