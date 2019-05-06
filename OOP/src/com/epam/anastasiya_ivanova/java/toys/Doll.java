package com.epam.anastasiya_ivanova.java.toys;

public class Doll extends Toy {
    private boolean voice;

    public Doll(String name, String material, boolean voice) {
        super(name, material);
        this.voice = voice;
    }

    public boolean isVoice() {
        return voice;
    }

    @Override
    public float calculateCost() {
        return 543;
    }

    @Override
    public String toString() {
        return "Doll{" +
                "name='" + getName() + '\'' +
                ", cost=" + calculateCost() +
                ", material='" + getMaterial() + '\'' +
                ", voice=" + voice +
                '}';
    }
}
