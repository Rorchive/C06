package com.rodrigoandrade.entities;

import java.util.UUID;

public class Zombie {
    private UUID uuid;
    private String name;
    private double health; 
    private boolean attackMode;

    public Zombie(String name) {
        this.uuid = UUID.randomUUID();
        this.name = name;
        this.health = 0;
        this.attackMode = false;
    }

    public UUID getUUID() {
        return this.uuid;
    }

    public void setName(String name) {
        this.name = name;
        return;
    }

    public String getName() {
        return this.name;
    }

    public void setHealth(double health) {
        this.health = health;
        return;
    }

    public double getHealth() {
        return this.health;
    }

    public void setAttackMode(boolean attackMode) {
        this.attackMode = attackMode;
        return;
    }

    public boolean getAttackMode() {
        return this.attackMode;
    }
}
