package com.company;

public class Parohod implements Moving {
    private Coordinates coordinates;

    @Override
    public void move(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

}
