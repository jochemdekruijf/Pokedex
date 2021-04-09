package com.java.practicums.pokedex;

public class Pokemon {
    private String name;
    private int hp;
    private Type type;
    private Weakness w;
    private Resistance r;
    private Attack a;

    public Pokemon(String nm, int hp, Type tp, Weakness w, Resistance r, Attack a) {
        this.name = nm;
        this.hp = hp;
        this.type = tp;
        this.w = w;
        this.r = r;
        this.a = a;
    }

    @Override
    public String toString() {
        return "" + name;
    }
}
