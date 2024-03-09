package org.example.core;

public class MedicineComponent implements Comparable<MedicineComponent>{
    private String name;
    private Integer weight;
    private int power;

    public MedicineComponent(String name, int weight, int power) {
        this.name = name;
        this.weight = weight;
        this.power = power;
    }

    public int getPower() {
        return power;
    }
    @Override
    public int compareTo(MedicineComponent o) {
        return power - o.power;
    }

    @Override
    public String toString() {
        return "MedicineComponent{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", power=" + power +
                '}';
    }
}
