package org.example;

public class Base {
    private Price price;

    private Integer number;

    private String name;

    public Base(Price price, Integer number, String name) {
        this.price = price;
        this.number = number;
        this.name = name;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public Price getPrice() {
        return price;
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
