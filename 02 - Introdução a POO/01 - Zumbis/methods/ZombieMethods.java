package com.rodrigoandrade.methods;

import com.rodrigoandrade.entities.Zombie;

public class ZombieMethods {
    
    public void Attack(Zombie zombie) {
        zombie.setAttackMode(true);
        System.out.printf("Arhhh! I'm %s and I'm attacking you!\n", zombie.getName());
        return;
    }

}