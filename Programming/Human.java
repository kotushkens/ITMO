package com.company;

public abstract class Human implements UsePhone, Moving {
    String name;
    int age;
    Coordinates coordinates = new Coordinates(0, 0);
    Town town;
    Home home;
    Barge barge;
    Street street;
    int HP=5;

    public Human (String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void setBarge(Barge barge){
        this.barge = barge;
    }

    public void hit(Human victim) {
        victim.HP--;
        System.out.println(name + " бьёт " + victim.name + " . Остаток здоровья у " + victim.name + " = " + victim.HP);
    }

    @Override
    public void move(Coordinates coordinates) {
       // System.out.println(name + " переместился с x = " + this.coordinates.x + " y = " + this.coordinates.y + " на x = " + coordinates.x + " y = " + coordinates.y);
        System.out.println(name + " переместился с (" + this.coordinates.x + ";" + this.coordinates.y + ") >>> (" + coordinates.x + ";" + coordinates.y + ")" );
        this.coordinates = coordinates;
    }

    @Override
    public String toString() {
        return name + " (" + coordinates.y + ";" + coordinates.x + ") ";
    }

    @Override
    public boolean equals(Object obj) {
        return (this.hashCode() == obj.hashCode());
    }

    @Override
    public int hashCode() {
        return name.hashCode(); //+ coordinates.hashCode();
    }

}
