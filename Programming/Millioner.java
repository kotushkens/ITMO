package com.company;

public class Millioner extends Human {
    Telephone telephone = new Telephone(326);
    Coordinates[] visited = {coordinates};

    public Millioner(String name, int age) {
        super(name, age);
    }


    @Override
    public void call(Telephone caller, Telephone accepter){
        caller.call(accepter, name + " отдает приказ найти выгодную акцию ");
    }

    @Override
    public void accept(Telephone accepter, Telephone caller) {
        accepter.accept(caller,  name + " принял звонок");
    }


    public boolean checkStreet() {
        return false;
    }


}
