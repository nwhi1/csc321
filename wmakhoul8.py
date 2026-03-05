#Wesam Makhoul

userInput = int(input("Guess a number between 0 and 9? "))
correctNumber = 7

if(userInput < correctNumber):
    print("incorrect, Guess higher")
    print("YOU LOST L")
elif(userInput > correctNumber):
    print("incorrect, Guess Lower")
    print("YOU LOST L")
else:
    print("Wow you guessed it right")

for i in range(5):
    print("IM PRINTING USING FOR LOOP")

x = 0
while x < 5:
    x += 1
    print("IM PRINTING USING WHILE LOOP")


