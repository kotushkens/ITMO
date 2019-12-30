package com.company;

public class Krikun extends Human{

    public Krikun(String name, int age) {
        super(name, age);
    }

    @Override
    public void call(Telephone caller, Telephone accepter){
        caller.call(accepter, "звонит крикун по имени " + name + " , и сообщает, что на " + barge.name + " барже положение дел - " + barge.getMood());
    }

    @Override
    public void accept(Telephone accepter, Telephone caller) {
        accepter.accept(caller, "крикун по имени " + name + " принял звонок");
    }

}
