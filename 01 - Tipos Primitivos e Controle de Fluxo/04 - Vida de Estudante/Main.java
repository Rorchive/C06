/**
 * @exercise: Vida de Estudante
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
        System.out.println("NPA score:");
        Scanner input = new Scanner(System.in);

        // Using bytes for memory efficiency
        byte npa;

        // Checking if -128 <= NPA <= 127 (byte overflow)
        try {
            npa = input.nextByte();
        } catch (Exception e) {
            input.close();
            System.out.println("Invalid score.");
            return;
        }

        if (npa >= 60) {
            System.out.println("Approved.");
        }else if (npa >= 30 && npa < 60) {
            System.out.println("You need to do NP3.");
            System.out.println("NP3 score:");

            byte np3;

            try {
                np3 = input.nextByte();
            } catch (Exception e) {
                input.close();
                System.out.println("Invalid score.");
                return;
            }

            float nfa = (np3 + npa)/(float)(2.0);

            System.out.printf("NFA: %.2f\n", nfa);

            if (nfa >= 60) {
                System.out.println("Approved.");
            }else {
                System.out.println("Failed.");
            }
        }else {
            System.out.println("Failed.");
        }

        input.close();
    }
}