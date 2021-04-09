package com.java.practicums.pokedex;

public class Main {

    public static void main(String[] args) {
        Type t1 = new Type("Water");
        Type t2 = new Type("Fire");
        Type t3 = new Type("Grass");
        Type t4 = new Type("Psychic");
        Type t5 = new Type("Colourless");
        Type t6 = new Type("Electric");
        Type t7 = new Type("Fighting");


        Attack a = new Attack("Fire breath", 80);
        Attack a2 = new Attack("Water blast", 70);
        Attack a3 = new Attack("Solarbeam", 75);
        Attack a4 = new Attack("Lighting bolt", 100);

        Weakness w = new Weakness(t2,2, t1);
        Weakness w2 = new Weakness(t1,2, t3);
        Weakness w3 = new Weakness(t3,2, t2);
        Weakness w4 = new Weakness(t6,2, t1);

        Resistance r = new Resistance(t2, 30, t3);
        Resistance r2 = new Resistance(t1, 30, t2);
        Resistance r3 = new Resistance(t3, 40, t1);
        Resistance r4 = new Resistance(t6, 40, t5);

        Pokemon p = new Pokemon("Charizard",150, t2, w, r, a);
        Pokemon p2 = new Pokemon("Blastoise",170, t1, w2, r2, a2);
        Pokemon p3 = new Pokemon("Venusaur",160, t3, w3, r3, a3);
        Pokemon p4 = new Pokemon("Pikachu",100, t4, w4, r4, a4);

        Trainer t = new Trainer("Ash");

        t.addPokemon(p);
        t.addPokemon(p);
        t.addPokemon(p);

//        p.attackPokemon(p2);
//        p2.attackPokemon(p);
//        p2.attackPokemon(p);

        p4.attackPokemon(p);
        p.attackPokemon(p4);
    }
}
