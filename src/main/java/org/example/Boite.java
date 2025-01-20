package org.example;

import java.util.ArrayList;

public class Boite {
    private ArrayList<Cupcake> cupcakes;
    private boolean hasOrderedBefore;

    public Boite(boolean hasOrderedBefore) {
        this.cupcakes = new ArrayList<>();
        this.hasOrderedBefore = hasOrderedBefore;
    }

    
    public double getPrice() {
        int cupcakeCount = 0;
        double cheapestCupcakePrice = Double.MAX_VALUE;

        double price = 0;
        
        for (Cupcake cupcake : cupcakes) {
            if (!isCupcakeOfTheDay(cupcake)) {
                cupcakeCount++;
                if (cupcake.getPrice(hasOrderedBefore) < cheapestCupcakePrice) {
                    cheapestCupcakePrice = cupcake.getPrice(hasOrderedBefore);
                }
            }
        }
        
        boolean discountApplied = false;
        for (Cupcake cupcake : cupcakes) {
            if (!isCupcakeOfTheDay(cupcake) && cupcake.getPrice(hasOrderedBefore) == cheapestCupcakePrice && !discountApplied && cupcakeCount >= 5) {
                cupcake.setPrice(0);
                discountApplied = true;
                system.out.println("Discount applied on cupcake: " + cupcake.getName() + " (" + cupcake.getPrice(hasOrderedBefore) + "€) => 0€");
                break;
            }
            else if (isCupcakeOfTheDay(cupcake)) {
                price += cupcake.getPrice(hasOrderedBefore)*0.6;
                system.out.println("Discount applied on cupcake: " + cupcake.getName()+ " (" + cupcake.getPrice(hasOrderedBefore) + "€) => " + cupcake.getPrice(hasOrderedBefore)*0.6 + "€");
            }
            else {
                price += cupcake.getPrice(hasOrderedBefore);
                system.out.println("Cupcake: " + cupcake.getName() + " => " + cupcake.getPrice(hasOrderedBefore) + "€");
            }
        }
        system.out.println("Total price: " + price + "€");
        return price;
    }

    private boolean isCupcakeOfTheDay(Cupcake cupcake) {
        cupcake.isCupcakeOfTheDay();
        return false;
    }

    public void AddCupcake(Cupcake cupcake) {
        cupcakes.add(cupcake);
    }
}
