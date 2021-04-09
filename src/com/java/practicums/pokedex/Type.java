package com.java.practicums.pokedex;

public class Type {
    private String name;

    public Type(String nm) {
        this.name = nm;
    }

    public String getName() {
        return name;
    }

    public void setName(String nm) {
        this.name = nm;
    }

    @Override
    public String toString() {
        return "" + name;
    }
}
