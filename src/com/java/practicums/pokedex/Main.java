package com.java.practicums.pokedex;

public class Main {

    public static void main(String[] args) {
        Type t1 = new Type("Water");
        Type t2 = new Type("Fire");
        Type t3 = new Type("Grass");

        Attack a = new Attack("Fire breath", 80);
        Resistance r = new Resistance(t3, 30, t3);
        Weakness w = new Weakness(t2,2.0, t1);

        Pokemon p = new Pokemon("Charizard",150, t2, w, r, a);
        System.out.println(p);

    }
}
