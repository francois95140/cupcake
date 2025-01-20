import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BoiteTest {

    @Test
    void testGetPrice() {
        ArrayList<Base> bases = new ArrayList<>();
        bases.add(new Base(2, "base"));
        bases.add(new Base(3, "base2"));
        bases.add(new Base(4, "base3"));
        
        ArrayList<Cream> creams = new ArrayList<>();
        creams.add(new Cream(1, "cream"));
        creams.add(new Cream(2, "cream2"));
        creams.add(new Cream(3, "cream3"));
        
        ArrayList<Topping> toppings = new ArrayList<>();
        toppings.add(new Topping(0.5f, "toppingName"));
        toppings.add(new Topping(1.0f, "toppingName2"));
        toppings.add(new Topping(1.5f, "toppingName3"));
        Boite boite = new Boite(false);

        boite.AddCupcake(new Cupcake(bases.get(0).use(), creams.get(0).use(), toppings));
        
        assertEquals(3.0, boite.getPrice());
    }
    
    @Test
    void testIsCupcakeOfTheDay() {
        Boite boite = new Boite(true);
        boite.AddCupcake(new Cupcake(new Base(2, "base"), new Cream(1, "cream")));
        assertEquals(false, boite.isCupcakeOfTheDay(new Cupcake(new Base(2, "base"), new Cream(1, "cream"))));
    }
}

