/**
 * @exercise: Zé do Lanche 2
 * @author: Rodrigo Andrade
 * @date: 25 Feb 2026
 * @license: MIT
 * @language: Java
 * @github: https://github.com/Rorchive/C06
 */

package com.rodrigoandrade;

import java.util.Scanner; 

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int firstHourMeals = input.nextInt();
        int secondHourMeals = input.nextInt();
        int thirdHourMeals = input.nextInt();
        input.close();

        int totalMeals =  firstHourMeals + secondHourMeals + thirdHourMeals;
        float averageMeals = (float) (totalMeals / 3.0);

        System.out.println("Total Meals: " + totalMeals);
        System.out.println("Average Meals: " + averageMeals);
    }
}