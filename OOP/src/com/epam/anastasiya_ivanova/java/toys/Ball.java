package com.epam.anastasiya_ivanova.java.toys;

public class Ball extends Toy {
    private float diameter;

    public Ball(String name, String material, float diameter) {
        super(name, material);
        this.diameter = diameter;
    }

    public float getDiameter() {
        return diameter;
    }

    @Override
    public float calculateCost() {
        return 507;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "name='" + getName() + '\'' +
                ", cost=" + calculateCost() +
                ", material='" + getMaterial() + '\'' +
                ", diameter=" + diameter +
                '}';
    }
}
