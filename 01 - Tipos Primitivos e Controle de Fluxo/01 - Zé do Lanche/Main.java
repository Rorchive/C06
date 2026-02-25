/**
 * @exercise: Zé do Lanche
 * @author: Rodrigo Andrade
 * @date: 24 Feb 2026
 * @license: MIT
 * @language: Java
 * @github: https://github.com/Rorchive/C06
*/

package com.rodrigoandrade;

public class Main {
    public static void main(String[] args) {

        // Using byte for memory efficiency
        byte firstHourMeals = 10;
        byte secondHourMeals = 4;
        byte thirdHourMeals = 2;

        byte totalMeals =  (byte) (firstHourMeals + secondHourMeals + thirdHourMeals);
        float averageMeals = (float) (totalMeals / 3.0);

        System.out.println("Total Meals: " + totalMeals);
        System.out.println("Average Meals: " + averageMeals);
    }
}