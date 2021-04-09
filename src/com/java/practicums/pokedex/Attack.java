package com.java.practicums.pokedex;

public class Attack {
    private String naam;
    private int damage;

    public Attack(String naam, int damage) {
        this.naam = naam;
        this.damage = damage;
    }

    public String getNaam() {
        return naam;
    }

    public int getDamage() {
        return damage;
    }

    @Override
    public String toString() {
        return "Pokemon heet" + naam + " en doet" + damage + "schade";
    }
}
