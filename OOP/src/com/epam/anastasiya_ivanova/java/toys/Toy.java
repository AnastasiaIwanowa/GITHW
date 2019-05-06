package com.epam.anastasiya_ivanova.java.toys;

public abstract class Toy {
    private String name;
    private float cost;
    private String material;

    public Toy(String name, String material) {
        this.name = name;
        this.cost = calculateCost();
        this.material = material;
    }

    public abstract float calculateCost();

    public String getName() {
        return name;
    }

    public float getCost() {
        return cost;
    }

    public String getMaterial() {
        return material;
    }

    @Override
    public String toString() {
        return "Toy{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                ", material='" + material + '\'' +
                '}';
    }
}
