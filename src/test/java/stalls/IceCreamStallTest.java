package stalls;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IceCreamStallTest {

    IceCreamStall iceCreamStall;

    @Before
    public void setUp() throws Exception {
        iceCreamStall = new IceCreamStall("Dream Cones", "Vanilla Ice", ParkingSpot.A4, 8);
    }

    @Test
    public void hasName() {
        assertEquals("Dream Cones", iceCreamStall.getName());
    }

    @Test
    public void hasOwner() {
        assertEquals("Vanilla Ice", iceCreamStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals(ParkingSpot.A4, iceCreamStall.getParkingSpot());
    }

    @Test
    public void hasRating() {
        assertEquals(8, iceCreamStall.getRating());
    }
}
