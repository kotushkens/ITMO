package com.company;

public class Krikun extends Human{

    public Krikun(String name, int age) {
        super(name, age);
    }

    @Override
    public void call(Telephone caller, Telephone accepter){
        try {
            caller.call(accepter, "звонит крикун по имени " + name + " , и сообщает, что на " + barge.name + " барже положение дел - " + barge.getMood());
        } catch (HasNotConnection exception) {
            System.out.println(exception.getMessage());
        }
    }

    @Override
    public void accept(Telephone accepter, Telephone caller) {
        try {
            accepter.accept(caller, "крикун по имени " + name + " принял звонок");
        } catch (HasNotConnection exception) {
            System.out.println(exception.getMessage());
        }
    }

}
