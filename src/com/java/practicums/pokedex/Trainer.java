package com.java.practicums.pokedex;

import java.util.ArrayList;

public class Trainer {
    private String name;
    private String password;
    private ArrayList<Pokemon> pokemons = new ArrayList<>();

    public Trainer(String nm) {
        this.name = nm;
    }

    public void addPokemon(Pokemon p) {
        pokemons.add(p);
    }

    @Override
    public String toString() {
        String str = "Trainer " + name + "heeft de volgende pokemons " + pokemons;
        for (Pokemon p : pokemons) {
            str += "\n" + p;
        }
        return str;
    }
}
