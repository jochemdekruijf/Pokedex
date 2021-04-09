package com.java.practicums.pokedex;

public class Attack {
    private String name;
    private int damage;

    public Attack(String naam, int damage) {
        this.name = naam;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    @Override
    public String toString() {
        return "Pokemon heet" + name + " en doet" + damage + "schade";
    }
}
