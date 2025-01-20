package org.example;

public class Cream {
    private Price price;

    private Integer number;

    private String name;

    public Cream(Price price, Integer number, String name) {
        this.price = price;
        this.number = number;
        this.name = name;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getNumber() {
        return number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
