package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class DodgemTest {

    Dodgems dodgems;

    @Before
    public void setUp() throws Exception {
        dodgems = new Dodgems("Bumper Cars", 5);
    }


    @Test
    public void hasName() {
        assertEquals("Bumper Cars", dodgems.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(5, dodgems.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, dodgems.getVisitCount());
    }

    @Test
    public void hasDefaultPrice() {
        assertEquals(4.50, dodgems.defaultPrice(), 0.1);
    }

    @Test
    public void chargeStandardPrice(){
        Visitor standardPrice = new Visitor(25, 180, 250);
        assertEquals(4.50, dodgems.priceFor(standardPrice), 0.1);
    }

    @Test
    public void chargeDiscountPrice(){
        Visitor discountPrice = new Visitor(9, 95, 15);
        assertEquals(2.25, dodgems.priceFor(discountPrice), 0.1);
    }

}
