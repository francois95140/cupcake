package org.example;
import java.util.List;

public class Menu {
    private List<String> dailyCupcakes;

    public Menu() {
        this.dailyCupcakes = new ArrayList<>();
    }

    public void addCupcake(String cupcake) {
        dailyCupcakes.add(cupcake);
    }

    public boolean hasCupcake(String cupcake) {
        return dailyCupcakes.contains(cupcake);
    }

    public List<String> getDailyCupcakes() {
        return dailyCupcakes;
    }
}
