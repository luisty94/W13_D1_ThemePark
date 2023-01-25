package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.*;
import static org.junit.Assert.assertFalse;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor tallVisitor;
    Visitor shortVisitor;
    Visitor youngVisitor;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        tallVisitor = new Visitor(20, 210,45.0);
        shortVisitor = new Visitor(17, 115, 34.0);
        youngVisitor = new Visitor(11, 140, 15.0);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void hasDefaultPrice() {
        assertEquals(8.40, rollerCoaster.defaultPrice(), 0.1);
    }


    @Test
    public void visitorAllowed() {
        assertTrue(rollerCoaster.isAllowedTo(tallVisitor));
    }

    @Test
    public void visitorNotAllowedHeight() {
        assertFalse(rollerCoaster.isAllowedTo(shortVisitor));
    }

    @Test
    public void visitorNotAllowedAge() {
        assertFalse(rollerCoaster.isAllowedTo(youngVisitor));
    }

    @Test
    public void chargeStandardPrice(){
        Visitor standardPrice = new Visitor(25, 180, 250);
        assertEquals(8.40, rollerCoaster.priceFor(standardPrice), 0.1);
    }

    @Test
    public void chargeExtraPrice(){
        assertEquals(16.80, rollerCoaster.priceFor(tallVisitor), 0.1);
    }
}
