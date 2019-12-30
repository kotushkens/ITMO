package com.company;

public class Town {
    private Coordinates centralCoordinates;
    public Barge[] barges = new Barge[10];
    public Build[] builds = new Build[10];
    public Street[] streets = new Street[10];
    private int indexBuild = -1;
    private int indexBarge = -1;
    private int indexStreet = -1;
    private int width;
    private int length;

     public Town (Coordinates centralCoordinates,int width, int length) {
         this.width = width;
         this.length = length;
         this.centralCoordinates = centralCoordinates;
     }

     public void addBuild(Build build) {
         indexBuild++;
         builds[indexBuild] = build;
     }

     public void addBarge (Barge barge) {
       indexBarge++;
       barges[indexBarge] = barge;
     }

     public void addStreet (Street street) {
         indexStreet++;
         streets[indexStreet] = street;
     }
}
