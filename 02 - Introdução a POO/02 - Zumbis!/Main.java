/**
 * @exercise Zumbi!
 * @author: Rodrigo Andrade
 * @date: 25 Mar 2026
 * @license: MIT
 * @language: Java
 * @github: https://github.com/Rorchive/C06
 */

package com.rodrigoandrade;

import com.rodrigoandrade.entities.Zumbi;

public class Main {
    public void main(String[] args) {
        Zumbi zumbi1 = new Zumbi();
        zumbi1.nome = "Zumbizão";
        zumbi1.vida = 100;

        Zumbi zumbi2 = new Zumbi();
        zumbi2.nome = "Zumbizinho";
        zumbi2.vida = 10;

        System.out.printf("Arhhh! Zumbizão tem %.2f HP!\n", zumbi1.mostraVida());
        System.out.printf("Ah! Zumbizinho tem %.2f HP!\n", zumbi2.mostraVida());
        
        zumbi1.transfereVida(zumbi2, 50);
        System.out.println("Realizando transfusão de sangue...");
    
        System.out.printf("Ah! Zumbizão tem %.2f HP!\n", zumbi1.mostraVida());
        System.out.printf("Arhhh! Zumbizinho tem %.2f HP!\n", zumbi2.mostraVida());
    }
}
