package com.java.practicums.pokedex;

public class Resistance {
    private Type type;
    private int resistanceAmount;
    private Type resistantTowardsType;

    public Resistance(Type type, int resistanceAmount, Type resistantTowardsType) {
        this.type = type;
        this.resistanceAmount = resistanceAmount;
        this.resistantTowardsType = resistantTowardsType;
    }

    public Type getType() {
        return type;
    }

    public int getResistanceAmount() {
        return resistanceAmount;
    }

    public Type getResistantTowardsType() {
        return resistantTowardsType;
    }

    @Override
    public String toString() {
        return " is van type" + type + "en verminder schade met " + resistanceAmount
                + " van type " + resistantTowardsType;
    }
}