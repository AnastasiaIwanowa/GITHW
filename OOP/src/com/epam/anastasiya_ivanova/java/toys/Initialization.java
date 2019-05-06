package com.epam.anastasiya_ivanova.java.toys;

public class Initialization {

    public static Toy[] initializeToys(){
        return new Toy[] {
                new Ball("Ball111", "skin", 5),
                new Car("Fire engine","plastic", 4),
                new Cube("Cube333", "wood", 78),
                new Doll("Annabell", "plastic", true)
        };
    }
}
