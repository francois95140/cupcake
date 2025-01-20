package test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MenuTest {

    private Menu menu;

    private Cupcake vanillaCupcake;
    private Cupcake chocolateCupcake;
    private Cupcake strawberryCupcake;

    @BeforeEach
    void setUp() {
        menu = new Menu();

        vanillaCupcake = new Cupcake("Vanilla Dream", Cream.VANILLA, 3.50);
        chocolateCupcake = new Cupcake("Chocolate Bliss", Cream.CHOCOLATE, 4.00);
        strawberryCupcake = new Cupcake("Strawberry Delight", Cream.STRAWBERRY, 4.50);

        menu.addCupcake(vanillaCupcake);
        menu.addCupcake(chocolateCupcake);
        menu.addCupcake(strawberryCupcake);
    }

    @Test
    void testCupcakeExistsInMenu() {
        assertTrue(menu.hasCupcake(vanillaCupcake), "Vanilla Dream should be in the menu");
        assertTrue(menu.hasCupcake(chocolateCupcake), "Chocolate Bliss should be in the menu");
    }

    @Test
    void testCupcakeDoesNotExistInMenu() {
        Cupcake matchaCupcake = new Cupcake("Matcha Magic", Cream.MATCHA, 4.75);
        assertFalse(menu.hasCupcake(matchaCupcake), "Matcha Magic should not be in the menu");
    }

    @Test
    void testGetDailyCupcakes() {
        assertEquals(3, menu.getDailyCupcakes().size(), "There should be 3 cupcakes in the menu");
        assertTrue(menu.getDailyCupcakes().contains(strawberryCupcake));
    }
}
