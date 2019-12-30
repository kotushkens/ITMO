package com.company;

public class Barge implements Moving {
    private Coordinates coordinates;
    Telephone telephone;
    Gorloderik[] gorloderiki = new Gorloderik[10];
    private int indexGorl = 0;
    private int indexKrik = 0;
    Krikun[] krikuni = new Krikun[10];
    Town town;
    private BargeMood mood;
    String name;

    @Override
    public void move(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public Town checkTown() {
        return null;
    }

    public Barge(Coordinates coordinates, Telephone telephone, String name) {
        this.coordinates = coordinates;
        this.telephone = telephone;
        this.name = name;
        int x = (int)(Math.random()*5);
        if (x == 0) {mood = BargeMood.GREAT;}
        if (x == 1) {mood = BargeMood.GOOD;}
        if (x == 2) {mood = BargeMood.NORMAL;}
        if (x == 3) {mood = BargeMood.BAD;}
        if (x == 4) {mood = BargeMood.AWFUL;}
    }

    public void addGorloderik (Gorloderik gorloderik) {
        gorloderiki[indexGorl] = gorloderik;
        indexGorl++;
        gorloderik.setBarge(this);
    }

    public void  addKrikun (Krikun krikun) {
        krikuni[indexKrik] = krikun;
        indexKrik++;
        krikun.setBarge(this);
    }

    public Gorloderik getGorloderik() {
        indexGorl--;
        return gorloderiki[indexGorl];
    }

    public Krikun getKrikun() {
        indexKrik--;
        return krikuni[indexKrik];
    }

    public BargeMood getMood(){
        return mood;
    }

    public void setMood(BargeMood ood) {
        this.mood = mood;
    }


}
