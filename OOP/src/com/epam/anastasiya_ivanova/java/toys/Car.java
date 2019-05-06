package com.epam.anastasiya_ivanova.java.toys;

public class Car extends Toy{
    private int countWheel;

    public Car(String name, String material, int countWheel) {
        super(name, material);
        this.countWheel = countWheel;
    }

    public int getCountWheel() {
        return countWheel;
    }

    @Override
    public float calculateCost() {
        return 1000;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + getName() + '\'' +
                ", cost=" + calculateCost() +
                ", material='" + getMaterial() + '\'' +
                ", countWheel=" + countWheel +
                '}';
    }
}
