import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OverlappingRectangleTest {

    @Test
    public void testPositiveField(){
        OverlappingRectangle overlappingRectangle = new OverlappingRectangle();
        int expected = 36;
        int actual =  overlappingRectangle.overlap(-1, -1, 10, 10, -1, 0, 3, 9);
        assertEquals(expected, actual);
    }

    @Test
    public void testNegativeField(){
        OverlappingRectangle overlappingRectangle = new OverlappingRectangle();
        int expected = 0;
        int actual =  overlappingRectangle.overlap(-12, -4, -1, -2, 0, 0, 100, 3000);
        assertEquals(expected, actual);
    }
}