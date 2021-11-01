package flowerstore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class FlowerBucketTest {
    private FlowerBucket flowerBucket;

    @BeforeEach
    void setUp() {
        Flower rose = new Flower(FlowerType.ROSE);
        rose.setPrice(10);
        Flower tulip = new Flower(FlowerType.TULIP);
        tulip.setPrice(5);

        FlowerPack roseFlowerPack = new FlowerPack();
        roseFlowerPack.setFlower(rose);
        roseFlowerPack.setAmount(10);

        FlowerPack tulipFlowerPack = new FlowerPack();
        tulipFlowerPack.setFlower(tulip);
        tulipFlowerPack.setAmount(1);

        flowerBucket = new FlowerBucket();
        flowerBucket.addFlowerPack(roseFlowerPack);
        flowerBucket.addFlowerPack(tulipFlowerPack);
    }

    @Test
    void price() {
        assertEquals(105, flowerBucket.price());
    }
}