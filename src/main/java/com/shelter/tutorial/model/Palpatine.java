package com.shelter.tutorial.model;

public class Palpatine {
    private boolean theSenate;

    public boolean isTheSenate() {
        return theSenate;
    }

    public void setTheSenate(boolean theSenate) {
        this.theSenate = theSenate;
    }

    @Override
    public String toString() {
        return "Palpatine{" +
                "theSenate=" + theSenate +
                '}';
    }
}
