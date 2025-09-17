package com.sp.lab1.dice;

import java.security.SecureRandom;
import java.util.Scanner;

public class DiceRoll {

	public static void main(String[] args) {
		System.out.print("Please enter the number of dice: ");

        
        Scanner input = new Scanner(System.in);
        int numberOfDice = input.nextInt();

        
        SecureRandom ranNum = new SecureRandom();

        System.out.print("Hey Geek! You rolled: ");
        int total = 0;

        for (int i = 0; i < numberOfDice; i++) {

           
        	int randomNumber = ranNum.nextInt(6) + 1;
            total = total + randomNumber;
            System.out.print(randomNumber);
            System.out.print(" ");
        }

        System.out.println("");
        System.out.println("Total: " + total);
        
        // First-roll outcome
        if (total == 7 || total == 11 || total == 15 || total == 21) {
            System.out.println("You WIN on the first roll!");
        } else if (total == 10 || total == 12 || total == 19 || total == 20 ||
                   total == 22 || total == 23 || total == 24 || total == 13) {
            System.out.println("You LOSE on the first roll!");
        } else {
            // Goal phase
            int goal = total;
            System.out.println("Your GOAL is: " + goal);
            while (true) {
                System.out.print("Press ENTER to roll again...");
                input.nextLine();

                int newTotal = 0;
                System.out.print("You rolled: ");
                for (int i = 0; i < numberOfDice; i++) {
                    int randomNumber = ranNum.nextInt(6) + 1;
                    newTotal += randomNumber;
                    System.out.print(randomNumber + " ");
                }
                System.out.println("\nTotal: " + newTotal);

                if (newTotal == 13) {
                    System.out.println("You LOSE (rolled 13).");
                    break;
                } else if (newTotal == goal) {
                    System.out.println("You WIN (matched the goal!).");
                    break;
                }
            }
        }
        input.close();

	}

}
