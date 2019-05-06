package com.epam.anastasiya_ivanova.java.toys;

public class Cube extends Toy{
    private float length;

    public Cube(String name, String material, float length) {
        super(name, material);
        this.length = length;
    }

    public float getLength() {
        return length;
    }

    @Override
    public float calculateCost() {
        return 360;
    }

    @Override
    public String toString() {
        return "Cube{" +
                "name='" + getName() + '\'' +
                ", cost=" + calculateCost() +
                ", material='" + getMaterial() + '\'' +
                ", length=" + length +
                '}';
    }
}
