package com.epam.maven_task;

/**
 * OtherSweets
 */
public class OtherSweets extends Sweets {

    public OtherSweets(String name, Integer weight, Integer price) {
        super(name, weight, price);
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return super.name;
    }

    @Override
    public Integer getPrice() {
        // TODO Auto-generated method stub
        return super.price;
    }

    @Override
    public Integer getWeight() {
        // TODO Auto-generated method stub
        return super.weight;
    }

    @Override
    public void addPrice(Integer price) {
        super.price += price;
    }

    @Override
    public void addWeight(Integer weight) {
        super.weight += weight;
    }

}