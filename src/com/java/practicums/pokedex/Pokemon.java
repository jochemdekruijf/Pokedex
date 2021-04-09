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
        String str = "";
        str += "Pokemon heet " + naam + " en heeft " + hp + " hp " + " is van type " + type + "\n";
        str += "Pokemon is zwak tegen " + w.getWeakTowardsType() + "\n";
        str += "Pokemon is resistent tegen " + r.getResistantTowardsType() + " met een vermindering van " + r.getResistanceAmount() + "\n";
        str += "Pokemon heeft aanval " + a.getNaam() + " dat " + a.getDamage() + " schade doet \n";
        return str;
    }
}
