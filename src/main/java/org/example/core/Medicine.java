package org.example.core;

import java.util.Collections;
import java.util.List;

public class Medicine implements Comparable<Medicine>{
    private String name;
    private Integer weight;
    private int power;
    private static int typeSort = 0;

    public Medicine(String name, int weight, int power) {
        this.name = name;
        this.weight = weight;
        this.power = power;
    }

    public static int getSumPower(int ...power){
        int sum = 0;
        for (int i = 0; i < power.length; i++) {
            sum += power[i];
        }
        return sum;
    }

    public static void sortAscending(List list){
        typeSort = 0;
        Collections.sort(list);
    }
    public static void sortDescending(List list){
        typeSort = 1;
        Collections.sort(list);
    }
    public static void sortingСomplicated(List list){
        typeSort = 2;
        Collections.sort(list);
    }
    public static void sortAlphabetical (List list){
        typeSort = 3;
        Collections.sort(list);
    }

    @Override
    public int compareTo(Medicine o) {
        if (typeSort == 0){
            return power - o.power;
        } else if (typeSort == 1) {
            return o.power - power;
        } else if (typeSort == 2) {
            int result = name.compareTo(o.name);
            if (result == 0){
                result = this.weight.compareTo(o.weight);
            }
            return result;
        }else
            return name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "Medicine{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", power=" + power +
                '}';
    }
}
