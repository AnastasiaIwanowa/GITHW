package com.epam.anastasiya_ivanova.java.toys;

import com.epam.anastasiya_ivanova.java.lesson2.task2.CostComparator;

import java.util.Arrays;

public class GameRoom {
    private Toy[] toys;

    public GameRoom(Toy[] toys){
        this.toys=toys;
    }

    public Toy[] getToys() {
        return toys;
    }

    public float getTotalCost(){
        float totalCost = 0;
        for (int i =0; i<toys.length; i++){
            totalCost+=toys[i].calculateCost();
        }
        return totalCost;
    }

    public void sortByCost(){
        Arrays.sort(toys, new CostComparator());
    }

    public void find (float left, float right){
        for (int i=0; i<toys.length; i++){
            if (toys[i].getCost()>=left && toys[i].getCost()<=right){
                System.out.println(toys[i]);
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("GameRoom:").append("\n");
        for (int i =0; i<toys.length; i++){
            result.append(toys[i].toString()).append("\n");
        }
        return result.toString();
    }
}
