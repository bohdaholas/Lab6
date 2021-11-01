package flowerstore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FlowerTest {
    private Flower flower;

    @BeforeEach
    void setUp() {
        flower = new Flower(FlowerType.TULIP);
        flower.setPrice(14.3);
        flower.setSepalLength(5);
        byte[] color = {127, 41, 45};
        flower.setColor(color);
    }

    @Test
    void getPrice() {
        assertEquals(14.3, flower.getPrice());
    }

    @Test
    void getSepalLength() {
        assertEquals(5, flower.getSepalLength());
    }

    @Test
    void getColor() {
        assertArrayEquals(new byte[]{127, 41, 45}, flower.getColor());
    }

    @Test
    void getFlowerType() {
        assertEquals(FlowerType.TULIP, flower.getFlowerType());
    }

    @Test
    void testToString() {
        assertEquals("Flower(price=14.3, sepalLength=5.0, color=[127, 41, 45], flowerType=TULIP)", flower.toString());
    }
}