package com.sp.lab1.dice;

import java.security.SecureRandom;
import java.util.Scanner;

public class DiceRoll {

	public static void main(String[] args) {
		System.out.print("Enter the number of dice: ");

        // Initializing the Scanner object to read input
        Scanner input = new Scanner(System.in);
        int numberOfDice = input.nextInt();

        // Initializing the Random object for
        // generating random numbers
        SecureRandom ranNum = new SecureRandom();

        System.out.print("Hey Geek! You rolled: ");
        int total = 0;
        int randomNumber = 0;

        for (int i = 0; i < numberOfDice; i++) {

            // Generating the random number and storing it
            // in the 'randomNumber' variable
            randomNumber = ranNum.nextInt(6) + 1;
            total = total + randomNumber;
            System.out.print(randomNumber);
            System.out.print(" ");
        }

        System.out.println("");
        System.out.println("Total: " + total);
        input.close();

	}

}
