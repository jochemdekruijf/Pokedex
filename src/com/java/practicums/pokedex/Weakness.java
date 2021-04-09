package com.java.practicums.pokedex;

public class Weakness {
    private Type type;
    private double multiplier;
    private Type weakTowardsType;


    public Weakness(Type tp, double mp, Type wTT) {
        this.type = tp;
        this.multiplier = mp;
        this.weakTowardsType = wTT;
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

    public void setType(Type tp) {
        this.type = tp;
    }

    public void setMultiplier(double mp) {
        this.multiplier = mp;
    }

    public void setWeakTowardsType(Type wTT) {
        this.weakTowardsType = wTT;
    }

    @Override
    public String toString() {
        return "Is van type" + type + "en heeft een multiplier van " + multiplier + "tegen " + weakTowardsType;
    }
}
