package com.company;

public class Government extends Human {
    public Government(String name, int age) {
        super(name, age);
    }

    @Override
    public void call(Telephone caller, Telephone accepter){
        try {
            caller.call(accepter, "звонит чиновник по имени " + name );
        } catch (HasNotConnection exception) {
            System.out.println(exception.getMessage());
        }
    }

    @Override
    public void accept(Telephone accepter, Telephone caller) {
        try {
            accepter.accept(caller, "чиновник по имени " + name + " принял звонок");
        } catch (HasNotConnection exception) {
            System.out.println(exception.getMessage());
        }
    }
    private void moveHuman(Human human, Coordinates coordinates){
        human.move(coordinates);
    }
}
