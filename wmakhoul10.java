//Wesam MAkhoul
//LAb 10
//

import java.util.Scanner;

public class WesamMAkhoul
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the height: ");
		double h = input.nextDouble();

		System.out.print("Enter the radius: ");
                double r = input.nextDouble();

		System.out.println("The volume is: " + calculateVolume(r, h));

	}

	public static double calculateVolume(double radius, double height)
	{
		double volume = Math.PI * radius * radius * height;

		return volume;
	}
}
