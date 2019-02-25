package com.haizhang.bean;

/**
 * 花卉的实体类
 *
 * @author 海章
 * @create 2019-02-23 20:56
 */
public class Flower {
    private int id;
    private String name;
    private double price;
    private String production;

    public Flower(int id, String name, double price, String production) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.production = production;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProduction() {
        return production;
    }

    public void setProduction(String production) {
        this.production = production;
    }
}
