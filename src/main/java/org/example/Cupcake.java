package org.example;

import java.util.ArrayList;
import java.util.List;

public class Cupcake {

    private Base base;

    private List<Topping> toppings;

    private Cream cream;

    private boolean isCupcakeOfTheDay;

    public Cupcake(Base base, Cream cream, Boolean dayli) {
        this.base = base;
        this.cream = cream;
        this.isCupcakeOfTheDay = dayli;
        this.toppings = new ArrayList<>();
    }

    public Cupcake(Base base, Cream cream, List<Topping> toppings, Boolean dayli) {
        this.base = base;
        this.cream = cream;
        this.isCupcakeOfTheDay = dayli;
        this.toppings = new ArrayList<>(toppings);
    }

    public float getPrice (boolean isOrderedBefor ){
        float price = base.getPrice().getValue() + cream.getPrice().getValue();
        if (isOrderedBefor){
            if (toppings.size() >= 1){
                return price;
            } else if (toppings.size() == 2 ) {
                if (toppings.getFirst().getPrice().getValue()>toppings.getLast().getPrice().getValue()){
                    return price + toppings.getFirst().getPrice().getValue();
                }else {
                    return price + toppings.getFirst().getPrice().getValue();
                }
            }
        }else {
            if (toppings.size() >= 1){
                return price + toppings.getFirst().getPrice().getValue();
            } else if (toppings.size() == 2 ) {
                return price + toppings.getFirst().getPrice().getValue() +  toppings.getLast().getPrice().getValue();
            }
        }
    }

}
