//Wesam Makhoul
//Exam 2
//

#include <stdio.h>

void printFunction(int n)
{
	char string[] = "Wesam";
	for(int i = 0 ; i < 5 ; i++)
	{
		printf("%s%d\n",string,n);
	}	
}

int main(void)
{
	printf("Enter a number:");

	int number;
	scanf("%d", &number);
	
	printFunction(number);
}
