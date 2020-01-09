package com.company;

public class Coordinates {
    int x;
    int y;
     public Coordinates(int x, int y) {
         this.x = x;
         this.y = y;
     }

     @Override
    public int hashCode(){
         return (x*37 + y*51);
     }

     @Override
    public boolean equals(Object object){
         boolean result = false;
         if (hashCode() == object.hashCode())
             result = true;
         return result;
     }
}
