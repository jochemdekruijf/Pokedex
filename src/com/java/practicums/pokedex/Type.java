package com.java.practicums.pokedex;

public class Type {
    private String name;

    public Type(String naam) {
        this.name = naam;
    }

    @Override
    public String toString() {
        return "" + name;
    }
}
