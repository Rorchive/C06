/**
 * @exercise: Adivinhação Aprimorado
 * @author: Rodrigo Andrade
 * @date: 25 Feb 2026
 * @license: MIT
 * @language: Java
 * @github: https://github.com/Rorchive/C06
*/

package com.rodrigoandrade;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        // Generates a random number between 1 and 10
        int randomNumber = rand.nextInt(10) + 1;

        System.out.println("Choose a number between 1 and 10:");

        int chosenNumber = input.nextInt();

        while (chosenNumber != randomNumber) {
            if (randomNumber < chosenNumber) {
                System.out.println("Wrong! Choose a little lower.");
            }else {
                System.out.println("Wrong! Choose a little higher.");
            }
            
            chosenNumber = input.nextInt();
        }

        System.out.println("Uhuuu! You chose right.");
        input.close();
    }
}