#Wesam Makhoul
#Lab 12

import math

def AreaRectangle(base, height):
    return base * height

def AreaCircle(radius):
    return math.pi * radius * radius

base = int(input("Enter a base:"))
height = int(input("Enter a height:"))
print("Your Rectangle area is: " + str(AreaRectangle(base, height)))

radius = int(input("Enter radius: "))
print("Your Circle area is: " + str(AreaCircle(radius)))





