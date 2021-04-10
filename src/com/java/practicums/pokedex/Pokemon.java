package com.java.practicums.pokedex;

import java.util.Locale;

public class Pokemon {
    private String name;
    private int hp;
    private Type type;
    private Weakness weakness;
    private Resistance resistance;
    private Attack attack;
    private String imgFront;
    private String imgBack;

    public Pokemon(String nm, int hp, Type tp, Weakness w, Resistance r, Attack a) {
        this.name = nm;
        this.hp = hp;
        this.type = tp;
        this.weakness = w;
        this.resistance = r;
        this.attack = a;
        this.imgFront = name.toLowerCase() + ".gif";
        this.imgBack= name.toLowerCase() + "-back.gif";
    }

    public int calcDamage(Pokemon p) {
        int dmg;

        if(this.type.getName().equals(p.weakness.getWeakTowardsType().getName())){
            dmg = this.attack.getDamage() * p.weakness.getMultiplier();

        } else if(this.type.getName().equals(p.resistance.getResistantTowardsType().getName())){
            dmg = this.attack.getDamage() - p.resistance.getResistanceAmount();

        }else {
            dmg = this.attack.getDamage();
        }

        return dmg;
    }

    public void attackPokemon(Pokemon p){
        int dmg = calcDamage(p);

        if(dmg < p.getHp()){
            int hp = p.getHp() - dmg;
            p.setHp(hp);
            System.out.println(this.name + " valt " + p.getName() + " aan met " + this.attack.getName() +
                    " voor " + dmg + " schade en " + p.getName() +" heeft " + p.getHp() + " hp over");

        }else {
            System.out.println( p.getName() + " is verlagen");
        }
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
