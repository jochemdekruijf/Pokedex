package com.java.practicums.pokedex;

public class Type {
    private String naam;

    public Type(String naam) {
        this.naam = naam;
    }

    @Override
    public String toString() {
        return "" + naam;
    }
}
