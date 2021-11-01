package flowerstore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StoreTest {
    private Store store = new Store();

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

        FlowerBucket flowerBucket = new FlowerBucket();
        flowerBucket.addFlowerPack(roseFlowerPack);
        flowerBucket.addFlowerPack(tulipFlowerPack);

        store.addFlowerBucket(flowerBucket);
    }

    @Test
    void search() {
        assertNotNull(store.search(10000));
    }
}