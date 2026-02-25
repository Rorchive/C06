/**
 * @exercise Cinema
 * @author: Rodrigo Andrade
 * @date: 24 Feb 2026
 * @license: MIT
 * @language: Java
 * @github: https://github.com/Rorchive/C06
 */

package com.rodrigoandrade;

public class Main {
    public static void main(String[] args) {
        var fullTicketAmount = 8;
        var halfTicketAmount = 5;

        var fullTicketPrice = 30.00;
        var halfTicketPrice = 15.00;

        var revenueFullTicket = fullTicketAmount * fullTicketPrice;
        var revenueHalfTicket = halfTicketAmount * halfTicketPrice;
        var revenueSession = (revenueFullTicket + revenueHalfTicket);

        var averageTicketPrice = (revenueSession)/(fullTicketAmount+halfTicketAmount);

        // Using textbox for fast formatting
        var output = """
                * Full Ticket Amount: %d
                * Half Ticket Amount: %d

                * Full Ticket Price: R$ %.2f
                * Half Ticket Price: R$ %.2f

                * Revenue Full Ticket: R$ %.2f
                * Revenue Half Ticket: R$ %.2f
                * Revenue Session: R$ %.2f

                * Average Ticket Price: R$ %.2f
                """;

        System.out.printf(output, fullTicketAmount, halfTicketAmount, fullTicketPrice, halfTicketPrice, revenueFullTicket, revenueHalfTicket, revenueSession, averageTicketPrice);
    }
}