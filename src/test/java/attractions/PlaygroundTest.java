package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.*;

public class PlaygroundTest {
    Playground playground;

    @Before
    public void setUp() throws Exception {
        playground = new Playground("Fun Zone", 7);
    }

    @Test
    public void hasName() {
        assertEquals("Fun Zone", playground.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(7, playground.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, playground.getVisitCount());
    }

    @Test
    public void visitorCanEnter() {
        Visitor youngVisitor = new Visitor(10, 100, 12.0);
        assertTrue(playground.isAllowedTo(youngVisitor));
    }

    @Test
    public void visitorCannotEnter() {
        Visitor oldVisitor = new Visitor(23, 183, 54.0);
        assertFalse(playground.isAllowedTo(oldVisitor));
    }
}
