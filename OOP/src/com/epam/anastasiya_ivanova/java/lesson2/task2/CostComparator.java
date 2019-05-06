package com.epam.anastasiya_ivanova.java.lesson2.task2;

import com.epam.anastasiya_ivanova.java.toys.Toy;

import java.util.Comparator;

public class CostComparator implements Comparator<Toy> {
    @Override
    public int compare(Toy o1, Toy o2) {
        return (int) (o1.getCost() - o2.getCost());
    }
}
