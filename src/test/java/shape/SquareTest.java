package shape;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    Square square;

    @BeforeEach
    void setUp() {
        square = new Square(4);
    }

    @Test
    void testSquareArea() {
        assertEquals(16, square.area(), "Square area is wrong");
    }

    @Test
    void testSizeSetterAndGetterWithPositiveValue() {
        square.setSize(1);
        assertEquals(1, square.getSize(), "Square size setter or getter is not working");
    }

    @Test
    void testSizeSetterWithNegativeValue() {
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> square.setSize(-1),
                "Square size can not be negative");
        assertEquals("Size must be positive.", exception.getMessage(), "Invalid message");
    }

    @Test
    void testSizeSetterWithZeroValue() {
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> square.setSize(0),
                "Square size can not be zero");
        assertEquals("Size must be positive.", exception.getMessage(), "Invalid message");
    }
}