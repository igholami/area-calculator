package shape;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    Rectangle rectangle;;

    @BeforeEach
    void setUp() {
        rectangle = new Rectangle(4, 5);
    }

    @Test
    void testRectangleArea() {
        assertEquals(20, rectangle.area(), "Rectangle area is wrong");
    }

    @Test
    void testWidthSetterAndGetterWithPositiveValue() {
        rectangle.setWidth(1);
        assertEquals(1, rectangle.getWidth(), "Rectangle width setter or getter is not working");
    }

    @Test
    void testHeightSetterAndGetterWithPositiveValue() {
        rectangle.setHeight(2);
        assertEquals(2, rectangle.getHeight(), "Rectangle height setter or getter is not working");
    }

    @Test
    void testWidthSetterWithNegativeValue() {
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> rectangle.setWidth(-1),
                "Rectangle width can not be negative");
        assertEquals("Width must be positive.", exception.getMessage(), "Invalid message");
    }

    @Test
    void testWidthSetterWithZeroValue() {
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> rectangle.setWidth(0),
                "Rectangle width can not be zero");
        assertEquals("Width must be positive.", exception.getMessage(), "Invalid message");
    }

    @Test
    void testHeightSetterWithNegativeValue() {
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> rectangle.setHeight(-1),
                "Rectangle width can not be negative");
        assertEquals("Width must be positive.", exception.getMessage(), "Invalid message");
    }

    @Test
    void testHeightSetterWithZeroValue() {
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> rectangle.setHeight(0),
                "Rectangle width can not be zero");
        assertEquals("Width must be positive.", exception.getMessage(), "Invalid message");
    }

}