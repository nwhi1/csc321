//Wesam Makhoul
//csc 321
//lab #9

#include <stdio.h>
#include <stdlib.h>

int main(void)
{
	int randomNum = (rand() % 20) + 1;

	printf("Guess a number between 1 and 20: ");

	int guess;
	scanf("%d", &guess);

        	if(guess < randomNum || guess > randomNum)
                {
                        printf("Guess again: ");
                        scanf("%d", &guess);

                        if(guess != randomNum)
                        {
                                if(guess > randomNum)
                                        printf("You have lost and your guess was higher than the correct number %d\n", randomNum);
                                else
                                        printf("You have lost and your guess was lower than the correct number %d\n", randomNum);
                        }
                }
                if(guess == randomNum)
                {
                        for(int i = 0 ; i < guess ; i++)
                               printf("You won and guessed the correct number");
                }
}


