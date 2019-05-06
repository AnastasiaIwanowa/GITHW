package com.epam.anastasiya_ivanova.java.lesson2.task2;

import com.epam.anastasiya_ivanova.java.toys.GameRoom;
import com.epam.anastasiya_ivanova.java.toys.Initialization;

public class Runner {
    private static final float FIND_COST_LEFT = 500;
    private static final float FIND_COST_RIGHT = 600;

    public static void main(String[] args) {
        StringBuilder result = new StringBuilder();
        GameRoom gameRoom = new GameRoom(Initialization.initializeToys());
        result.append(gameRoom.toString()).append("\n")
                .append("Total cost of all toys = ")
                .append(gameRoom.getTotalCost()).append("\n").append("\n")
                .append("Toys sorted by cost").append("\n");
        gameRoom.sortByCost();
        result.append(gameRoom.toString()).append("\n")
        .append("Toys in the cost range from ").append(FIND_COST_LEFT).append(" to ").append(FIND_COST_RIGHT);
        System.out.println(result.toString());
        gameRoom.find(FIND_COST_LEFT,FIND_COST_RIGHT);
    }

}
