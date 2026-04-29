//Wesam Makhoul
//csc 321
//lab #11

#include <stdio.h>
#include <stdlib.h>
#include <math.h>

double calculate(double b, double h)
{
	double length = sqrt(b*b + h*h);

	return length;
}


int main(void)
{
	double base, height;

	printf("Enter a base:");
        scanf("%lf", &base);

	printf("Enter a height:");
	scanf("%lf", &height);

	double result = calculate(base, height);

	printf("the result is: %f\n" ,result);
}

