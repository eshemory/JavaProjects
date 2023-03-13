# JavaProjects
Java projects that I completed while in College.

Summary of each project:

Arcade.java:

The code defines a Java class named "Arcade" that contains a main method which calculates the number of candy bars and gumballs a person can buy with 48 coupons. 
The cost of one candy bar is 10 coupons and the cost of one gumball is 3 coupons. 
The program then outputs the number of coupons the person has, as well as the number of candy bars and gumballs they can purchase with those coupons.

Automobile.java:

The code defines a Java class named "Automobile" that contains a main method which calculates the cost of a commute given the distance of the commute, the automobile's fuel consumption, and the price of fuel. 
The user is prompted to enter these values through the console using a Scanner object. The program then calculates the cost of the commute by multiplying the price of fuel by the distance of the commute divided by the automobile's fuel consumption. 
The result is then formatted as currency using a NumberFormat object and output to the console.

Counter.java:

The code defines a Java class named "Counter" that contains methods to increment, decrement, reset, and retrieve a count value. 
The class has two constructors, one that initializes the count to zero, and another that allows the count to be initialized to a specific value, provided it is greater than zero. 
The toString method returns a string representation of the current count value, and the equals method checks if two Counter objects have the same count value.

CounterTester.java:

Tests the Counter class.

Cryptarithmetic.java:

This program attempts to solve a cryptarithmetic puzzle where the letters T, O, G, and D represent different digits 
and the equation "TOO + TOO + TOO + TOO = GOOD" must be satisfied. 
It uses a brute force approach to find all possible values for T, O, G, and D that make the equation true, printing out each solution.

Diving.java:

This program is a simple implementation of a diving score calculator. 
It prompts the user to enter scores from seven judges and then calculates the overall score for the dive 
based on the degree of difficulty 
and the trimmed sum of the scores (i.e., the sum of the five middle scores).

Euclid.java:

This program includes three methods: gcd, fib, and gcdR. 
The gcd method implements the iterative version of the Euclidean algorithm to find the greatest common divisor (GCD) of two integers a and b. 
The fib method recursively calculates the nth Fibonacci number, where n is the parameter passed to the method. Finally, the gcdR method recursively calculates the GCD of a and b using the Euclidean algorithm. 
The main method simply tests these three methods. 
Specifically, it prints out the GCD of 24 and 32 using the gcdR method and the 9th Fibonacci number using the fib method.

EuclidTester.java:

Tests the Euclid program.

Fraction.java:

This class provides basic functionality for working with fractions in Java.

FractionTester.java:

Tests the Fraction class.

HotDogStand.java:

The code defines a HotDogStand class that keeps track of the number of hot dogs sold by each stand, as well as the total number of hot dogs sold by all stands. 
Each HotDogStand object has an ID number and a number of hot dogs sold, which can be updated with the justSold() method. 
The total number of hot dogs sold by all stands is tracked with a static variable totalHotDogsSold. 
The class also provides methods to get the number of hot dogs sold by a particular stand, 
the ID number of a particular stand, and the total number of hot dogs sold by all stands.

HotDogStandTester.java:

Tests the HotDogStand program.

Menu.java:

This is a Java program that creates a menu for a restaurant. It uses the NumberFormat class to format prices as currency for both Germany and the United States. 
The program declares variables for dish names, prices, and the exchange rate between the Euro and the US dollar. 
It then prints out the menu in two different sections: one with the dish names and prices in German and Euros,
and another with the dish names and prices in English and US dollars.

Money.java:

This is a class named Money which represents a monetary amount. It has three constructors: one that takes dollars and cents as parameters, one that takes dollars as a parameter and assumes that the cents are zero,and one that assumes both dollars and cents are zero.
The class has methods for adding and subtracting amounts of money, add() and minus() respectively, which take two Money objects as parameters and return a new Money object representing the result.
The class also has a method equals() that takes another Money object as a parameter and returns true if the two objects represent the same amount of money.
Finally, the class has toString() method that returns a string representation of the amount of money in the format "$X.YY", where X is the number of dollars and YY is the number of cents. It also has getters and setters for the dollars and cents fields.

MoneyTester.java:

Tests the Money program.

Odometer.java:

The code defines a class called Odometer, which has instance variables for milesDriven and fuelEfficiency. 
It has methods for resetting the odometer to 0, setting the fuel efficiency, adding miles driven to the odometer,
and calculating the fuel consumed based on the current odometer reading and fuel efficiency.

OdometerTester.java:

Tests the Odometer program.

PalindromeChecker.java:

The code is a Java program that checks if a user-input word is a palindrome. 
It repeatedly prompts the user to enter a word and checks if it is a palindrome or not until the user chooses to quit. 
The program determines if the word is a palindrome by iterating through it with two indexes, starting from the first and last character respectively. 
It compares the characters at the current indexes, and if they match, continues to the next pair of characters towards the middle of the word. 
If the characters don't match, it stops and returns false. 
If the loop reaches the middle of the word without finding any non-matching characters, the word is a palindrome, and the program returns true. 
The program uses a Scanner object to get user input from the console.

Sorter.java:

This Java code implements the Bubble Sort and Cocktail Shaker Sort algorithms to sort an array of integers. 
The exchg method exchanges elements in the array, and the less method checks if one element is less than another. 
bubbleSort compares adjacent elements and swaps them until there are no more swaps, while cocktailShakerSort sorts the array in both directions.

StandardDeviation.java:

This Java code calculates the standard deviation of an array of integers using the formula sqrt(variance),
where variance is calculated by finding the average of the squared differences between each element and the mean of the array. 
The standardDeviation method takes an array and its length as input and returns the standard deviation. 
In the main method, a random array of integers is generated, and its standard deviation is printed to the console.

TriangleShape.java:
This program prompts the user to enter the sides of a triangle and calculates its area and perimeter. 
It checks if the input is valid for a triangle, and outputs an error message if not. 
The program uses a do-while loop to allow the user to perform multiple calculations. 
The program uses a DecimalFormat object to format the output with three decimal places. 
The program uses a Scanner object to read user input from the console.
