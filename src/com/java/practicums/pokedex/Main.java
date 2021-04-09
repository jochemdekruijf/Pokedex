package com.java.practicums.pokedex;

public class Main {

    public static void main(String[] args) {
        Type t1 = new Type("Water");
        Type t2 = new Type("Fire");
        Type t3 = new Type("Metal");
        Type t4 = new Type("Psychic");

        Attack a = new Attack("Fire breath", 80);

        Resistance r = new Resistance(t3, 30, t3);
        Weakness w = new Weakness(t2,2.0, t1);

        Pokemon p = new Pokemon("Charizard",150, t2, w, r, a);

        Trainer t = new Trainer("Trainer 1");

        t.addPokemon(p);
        t.addPokemon(p);
        t.addPokemon(p);

        System.out.println(t);
    }
}
