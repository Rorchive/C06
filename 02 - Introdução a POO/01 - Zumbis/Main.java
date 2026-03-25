/**
 * @exercise Zumbi
 * @author: Rodrigo Andrade
 * @date: 25 Mar 2026
 * @license: MIT
 * @language: Java
 * @github: https://github.com/Rorchive/C06
 */

package com.rodrigoandrade;

import com.rodrigoandrade.entities.Zombie;
import com.rodrigoandrade.methods.ZombieMethods;

public class Main {
    public void main(String[] args) {
        Zombie initialZombie = new Zombie("Initial Zombie");

        initialZombie.setHealth(100);

        System.out.printf("The Zombie %s was created with %.2f HP!\n", initialZombie.getName(), initialZombie.getHealth());

        ZombieMethods zombieMethods = new ZombieMethods();

        zombieMethods.Attack(initialZombie);
    }
}
