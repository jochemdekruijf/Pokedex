package com.java.practicums.pokedex;

public class Pokemon {
    private String naam;
    private int hp;
    private Type type;
    private Weakness w;
    private Resistance r;
    private Attack a;

    public Pokemon(String naam, int hp, Type type, Weakness w, Resistance r, Attack a) {
        this.naam = naam;
        this.hp = hp;
        this.type = type;
        this.w = w;
        this.r = r;
        this.a = a;
    }

    @Override
    public String toString() {
        return "" + naam;
    }
}
