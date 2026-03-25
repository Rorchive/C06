package com.rodrigoandrade.entities;

public class Zumbi {
    
    public String nome;
    public double vida;
    
    public double mostraVida() {
        return this.vida;
    }

    public void transfereVida(Zumbi zumbiAlvo, double quantia) {
        if (this.vida < quantia) return;

        this.vida -= quantia;
        zumbiAlvo.vida += quantia;
    }
}