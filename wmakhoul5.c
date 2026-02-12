//Wesam Makhoul
//Csc321
//

#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main(void)
{
	int i1 = 5;
	double d1 = 64.5;
        char c1 = 'c';
	char s1[] = "hi";


	printf("Address of integer: %p\n", &i1);
        printf("Address of double: %p\n", &d1);
	printf("Address of character: %p\n", &c1);
	printf("Address of String: %p\n", &s1);

	if(i1 != 5)
	{
		int i2 = 8;
	}
	//printf("The second integer is: %d\n",i2);

	int myArray[10] = {1,2,3,4,5,6,7,8,9,10};

	for(int i = 0 ; i < 10 ; i++)
	{
		printf("Number %d Address is %p\n", myArray[i], &myArray[i]);
	}
}





