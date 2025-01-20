package org.example;

import java.util.ArrayList;
import java.util.List;

public class Cupcake {

    private Base base;

    private List<Topping> toppings;

    private Cream cream;

    public Cupcake(Base base, Cream cream) {
        this.base = base;
        this.cream = cream;
        this.toppings = new ArrayList<>();
    }

    public Cupcake(Base base, Cream cream, List<Topping> toppings) {
        this.base = base;
        this.cream = cream;
        this.toppings = new ArrayList<>(toppings);
    }



}
