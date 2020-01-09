package com.company;

public class Town {
    private Coordinates centralCoordinates;
    public Barge[] barges = new Barge[10];
    public Build[] builds = new Build[10];
    public Street[] streets = new Street[10];
    public Citizen[] citizens = new Citizen[10];
    public Krikun[] krikuns = new Krikun[10];
    public Square[] squares = new Square[10];
    private int indexBuild = -1;
    private int indexBarge = -1;
    private int indexStreet = -1;
    private int indexCitizen = 0;
    private int indexKrikun = 0;
    private int indexSquare = -1;
    private int width;
    private int length;

    public Town(Coordinates centralCoordinates, int width, int length) {
        this.width = width;
        this.length = length;
        this.centralCoordinates = centralCoordinates;
    }

    public void addBuild(Build build) {
        indexBuild++;
        builds[indexBuild] = build;
    }

    public void addBarge(Barge barge) {
        indexBarge++;
        barges[indexBarge] = barge;
    }

    public void addStreet(Street street) {
        indexStreet++;
        streets[indexStreet] = street;
    }

    public void addCitizen(Citizen citizen) {
        citizens[indexCitizen] = citizen;
        indexCitizen++;
    }

    public void addKrikun(Krikun krikun) {
        krikuns[indexKrikun] = krikun;
        indexKrikun++;
    }

    public Krikun getKrikun() {
        indexKrikun--;
        return krikuns[indexKrikun];
    }

    public Citizen getCitizen() {
        indexCitizen--;
        return citizens[indexCitizen];
    }

    public class Square {
        Coordinates coordinate;
        String name;
        int width;
        int length;
    }
    public void addSquare(Square square) {
        indexSquare++;
        squares[indexSquare] = square;

    }
}
