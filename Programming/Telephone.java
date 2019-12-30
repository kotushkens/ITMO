package com.company;

public class Telephone {
    private Telephone[] connections = new Telephone[5];
    private int connectionIndex = 0;
    private int number;
    public Telephone(int number) {
        this.number = number;
    }

    public void addConnection(Telephone telephone) {
        connections[connectionIndex] = telephone;
        connectionIndex++;
        if (!telephone.hasConnection(this))
        telephone.addConnection(this);
    }

    public void deleteConnection (Telephone telephone) {
        for (int i = 0; i < connections.length; i++)
            if (connections[i] == telephone)
                connections[i] = null;
            if (telephone.hasConnection(this))
            telephone.deleteConnection(this);
    }

    private boolean hasConnection(Telephone telephone) {
        boolean result = false;
        for (Telephone tel:connections)
            if (tel == telephone) result = true;

        return result;
    }


    public void call(Telephone accepter, String message) {
        if (hasConnection(accepter)) {
            System.out.println("Звонок совершен: c номера " + number + " на номер " + accepter.number);
            System.out.println("Во время звонка сказали: " + message);
        } else System.out.println("Connetiona нема: " + number + " не смог дозвонитЬЬЬся до номера " + accepter.number);
    }

    public void accept(Telephone caller, String message) {
        if (hasConnection(caller)) {
            System.out.println("Звонок принят: номером " + number + " от номера " + caller.number);
            System.out.println("Во время звонка сказали: " + message);
        } else System.out.println("Connectiona нема: " + number + " не смог принять звонок от номера " + caller.number);
    }


}

