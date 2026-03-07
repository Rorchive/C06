/**
 * @exercise: Exercício Avaliativo I (Cinema/Scanner)
 * @author: Rodrigo Andrade
 * @date: 06 Mar 2026
 * @license: MIT
 * @language: Java
 * @github: https://github.com/Rorchive/C06
*/

package com.rodrigoandrade;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        inputScanner.useLocale(Locale.US);

        // Short type is sufficient for ticket counts in a cinema session (max 32767)
        short fullTicketAmount;
        float fullTicketPrice;
        short halfTicketAmount;
        float halfTicketPrice;

        try {
            System.out.print("Amount of integer ticket: ");
            fullTicketAmount = Short.parseShort(inputScanner.nextLine());

            System.out.print("Price of integer ticket: ");
            fullTicketPrice = Float.parseFloat(inputScanner.nextLine().replace(",", "."));

            System.out.print("Amount of half ticket: ");
            halfTicketAmount = Short.parseShort(inputScanner.nextLine());

            System.out.print("Price of half ticket: ");
            halfTicketPrice = Float.parseFloat(inputScanner.nextLine().replace(",", "."));
        } catch (NumberFormatException numberFormatException) {
            System.out.println("Invalid input. Please enter a valid number.");
            inputScanner.close();
            return;
        } catch (Exception exception) {
            System.out.println("An unknown error has occurred, try again.");
            inputScanner.close();
            return;
        }

        float revenueFullTicket = fullTicketAmount * fullTicketPrice;
        float revenueHalfTicket = halfTicketAmount * halfTicketPrice;
        float revenueTotal = revenueFullTicket + revenueHalfTicket;
        int totalTickets = fullTicketAmount + halfTicketAmount;
        // Prevent division by zero
        float revenueAverage = (totalTickets == 0) ? 0 : (revenueTotal / totalTickets);

        String outputFormat = """
                ==== CINEMA INFORMATION ====

                Full Ticket Amount: %d
                Full Ticket Price: %.2f
                Full Ticket Revenue: %.2f

                Half Ticket Amount: %d
                Half Ticket Price: %.2f
                Half Ticket Revenue: %.2f

                Total Tickets: %d
                Total Revenue: %.2f
                Average Revenue: %.2f
                """;

        System.out.printf(outputFormat, fullTicketAmount, fullTicketPrice, revenueFullTicket, halfTicketAmount, halfTicketPrice, revenueHalfTicket,  totalTickets, revenueTotal, revenueAverage);

        inputScanner.close();
    }
}
