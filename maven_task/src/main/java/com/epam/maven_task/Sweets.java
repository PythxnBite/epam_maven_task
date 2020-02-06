package com.epam.maven_task;

/**
 * Sweets
 */
public abstract class Sweets implements NewYearsGift {
    protected Integer weight, price;
    protected String name;

    public Sweets(String name, Integer weight, Integer price) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    public abstract String getName();

    public abstract void addWeight(Integer weight);

    public abstract void addPrice(Integer price);

}