package com.epam.maven_task;

/**
 * Chocolate
 */
public class Chocolate implements NewYearsGift {
    private Integer weight, price;
    private String name;

    public Chocolate(String name, Integer weight, Integer price) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    @Override
    public Integer getPrice() {
        // TODO Auto-generated method stub
        return this.price;
    }

    @Override
    public Integer getWeight() {
        // TODO Auto-generated method stub
        return this.weight;
    }

    /**
     * @return the name
     */
    public String getName() {
        return this.name;
    }

    public void addWeight(Integer weight) {
        this.weight += weight;
    }

    public void addPrice(Integer price) {
        this.price += price;
    }
}