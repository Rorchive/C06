/**
 * @exercise: Sala de Aula
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
        System.out.println("Students number:");
        Scanner input = new Scanner(System.in);

        short students;

        // Check for short overflow
        try {
            students = input.nextShort();
        } catch (Exception e) {
            input.close();
            System.out.println("Invalid students number.");
            return;
        }

        switch (students) {
            case 10:
            case 20:
                System.out.println("Classroom: I-6");
                break;
            case 30:
                System.out.println("Classroom: I-5");
                break;
            default:
                System.out.println("No classroom available.");
                break;
        }

        input.close();
    }
}