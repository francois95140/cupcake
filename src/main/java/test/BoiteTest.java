package test;

import org.example.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BoiteTest {

    @Test
    void testGetPrice() {
        Boite boite = new Boite(false);
        boite.AddCupcake(new Cupcake(new Base(new Price(2), "base"), new Cream(1, "cream")));
        Cupcake cupcake = new Cupcake(new Base(2, "base"), new Cream(1, "cream"), new ArrayList<Topping>() {{
            add(new Topping(0.5f, "toppingName"));
        }});
        assertEquals(3.0, boite.getPrice());
    }
    
    @Test
    void testIsCupcakeOfTheDay() {
        Boite boite = new Boite(true);
        boite.AddCupcake(new Cupcake(new Base(2, "base"), new Cream(1, "cream")));
        assertEquals(false, boite.isCupcakeOfTheDay(new Cupcake(new Base(2, "base"), new Cream(1, "cream"))));
    }
}

