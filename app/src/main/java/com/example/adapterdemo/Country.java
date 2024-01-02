package com.example.adapterdemo;

public class Country {
    int flagResourceId;
    String name;

    public Country(int flagResourceId, String name) {
        this.flagResourceId = flagResourceId;
        this.name = name;
    }

    @Override
    public String toString() {
        return getName(); // You can add anything else like maybe getDrinkType()
    }

    public String getName() {
        return name;
    }

    public int getFlagResourceId() {
        return flagResourceId;
    }
}
