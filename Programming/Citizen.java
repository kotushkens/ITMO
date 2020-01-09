package com.company;

import java.sql.SQLOutput;

public class Citizen extends Human {
    public Citizen(String name, int age) {
        super(name, age);
    }

    @Override
    public void call(Telephone caller, Telephone accepter){
        try {
            caller.call(accepter, "звонит житель по имени " + name );
        } catch (HasNotConnection exception) {
            System.out.println(exception.getMessage());
        }
    }

    @Override
    public void accept(Telephone accepter, Telephone caller) {
        try {
            accepter.accept(caller, "житель по имени " + name + " принял звонок");
        } catch (HasNotConnection exception) {
            System.out.println(exception.getMessage());
        }
    }

    public void Report(Government gov) {
        System.out.println("Житель по имени " + name + " жалуется " + "чиновнику по имени" + gov.name);
    }
}
