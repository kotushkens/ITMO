package com.company;

public class BusinessShare {
    private int cost;
    private TypeOfBusinessShare type;

     public int getCost() {
         return cost;
     }

     public void setCost(int cost) {
         this.cost = cost;
     }

     public TypeOfBusinessShare getType(){
         return type;
     }

    public void setType(TypeOfBusinessShare type) {
        this.type = type;
    }

    public BusinessShare () {
         this.cost = (int)(Math.random()*100);
         int x = (int)(Math.random()*4);
         if (x == 0) {type = TypeOfBusinessShare.GIGANT;}
         if (x == 1) {type = TypeOfBusinessShare.LARGE;}
         if (x == 2) {type = TypeOfBusinessShare.STANDART;}
         if (x == 3) {type = TypeOfBusinessShare.SMALL;}
    }
}
