package pricedisplay;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class pricedisplayTest {
    @Test
    public void displayProductAndPrice(){
        DisplayProductAndPrice displpr = new DisplayProductAndPrice();
        assertEquals("The price for the flower is 15",displpr.add("flower",15));
    }


}
