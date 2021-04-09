package com.java.practicums.pokedex;

public class Weakness {
    private Type type;
    private double multiplier;
    private Type weakTowardsType;


    public Weakness(Type type, double multiplier, Type weakTowardsType) {
        this.type = type;
        this.multiplier = multiplier;
        this.weakTowardsType = weakTowardsType;
    }

    public Type getType() {
        return type;
    }

    public double getMultiplier() {
        return multiplier;
    }

    public Type getWeakTowardsType() {
        return weakTowardsType;
    }

    @Override
    public String toString() {
        return "Is van type" + type + "en heeft een multiplier van " + multiplier + "tegen " + weakTowardsType;
    }
}
