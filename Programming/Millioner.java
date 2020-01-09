package com.company;

public class Millioner extends Human {
    Telephone telephone = new Telephone(326);
    Town town;

    public void setTown(Town town) {
        this.town = town;
    }

    public Millioner(String name, int age) {
        super(name, age);
    }


    @Override
    public void call(Telephone caller, Telephone accepter){
        try {
            caller.call(accepter, name + " отдает приказ найти выгодную акцию ");
        } catch (HasNotConnection exception) {
            System.out.println(exception.getMessage());
        }
    }

    @Override
    public void accept(Telephone accepter, Telephone caller) {
        try {
            accepter.accept(caller, name + " принял звонок");
        } catch (HasNotConnection exception) {
            System.out.println(exception.getMessage());
        }
    }


    public void checkPlace() {
        System.out.println( name + " находится " + coordinates.x + ";" + coordinates.y);
        boolean result = false;
         for (Street st:town.streets)
             if (st.coordinates.equals(coordinates)) {
                 System.out.println(name + " находится на знакомой улице " + st.name);
                 result = true;
                 break;
             }
         if (!result)
             System.out.println(name + " находится на незнакомой улице ");
    }



}
