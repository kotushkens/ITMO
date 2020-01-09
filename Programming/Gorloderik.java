package com.company;

public class Gorloderik extends Human implements UsePhone, Moving {
    @Override
    public void move(Coordinates coordinates) {

    }
    @Override
    public void call(Telephone caller, Telephone accepter){
        BusinessShare actualBusinessShare = new BusinessShare();
        try {
            caller.call(accepter, "звонит горлодерик по имени " + name + ", лучшая акция типа " + actualBusinessShare.getType() + " стоит " + actualBusinessShare.getCost());
        } catch (HasNotConnection exception) {
            System.out.println(exception.getMessage());
        }
    }

    public Gorloderik (String name, int age) {
        super(name, age);
    }

    @Override
    public void accept(Telephone accepter, Telephone caller) {
        BusinessShare actualBusinessShare = new BusinessShare();
        try {
            accepter.accept(caller, "АТВИЧАИТ горлодерик по имени " + name + ", лучшая акция типа " + actualBusinessShare.getType() + " стоит " + actualBusinessShare.getCost());
        } catch (HasNotConnection exception) {
            System.out.println(exception.getMessage());
        }
    }

}

