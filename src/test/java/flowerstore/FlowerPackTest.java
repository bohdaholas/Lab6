package flowerstore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlowerPackTest {
    private FlowerPack flowerPack;

    @BeforeEach
    void setUp() {
        Flower rose = new Flower(FlowerType.ROSE);
        rose.setPrice(10);
        flowerPack = new FlowerPack();
        flowerPack.setFlower(rose);
        flowerPack.setAmount(10);
    }

    @Test
    void price() {
        assertEquals(100, flowerPack.price());
    }
}