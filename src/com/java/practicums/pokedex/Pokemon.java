package com.java.practicums.pokedex;

public class Pokemon {
    private String name;
    private int hp;
    private Type type;
    private Weakness weakness;
    private Resistance resistance;
    private Attack attack;

    public Pokemon(String nm, int hp, Type tp, Weakness w, Resistance r, Attack a) {
        this.name = nm;
        this.hp = hp;
        this.type = tp;
        this.weakness = w;
        this.resistance = r;
        this.attack = a;
    }

    public String getName() {
        return name;
    }

    public void setName(String nm) {
        this.name = nm;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Weakness getWeakness() {
        return weakness;
    }

    public void setWeakness(Weakness w) {
        this.weakness = w;
    }

    public Resistance getResistance() {
        return resistance;
    }

    public void setResistance(Resistance r) {
        this.resistance = r;
    }

    public Attack getAttack() {
        return attack;
    }

    public void setAttack(Attack a) {
        this.attack = a;
    }

    @Override
    public String toString() {
        return "" + name;
    }
}
