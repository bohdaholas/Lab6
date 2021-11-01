package flowerstore;

import item.Item;

import java.util.ArrayList;
import java.util.List;

public class FlowerBucket extends Item {
    List<FlowerPack> flowerPacks = new ArrayList<>();

    public void addFlowerPack(FlowerPack flowerPack) {
        this.flowerPacks.add(flowerPack);
    }

    public double price() {
        double price = 0;
        for (FlowerPack flowerPack : flowerPacks) {
            price += flowerPack.price();
        }
        return price;
    }

    @Override
    public String toString() {
        return "FlowerBucket{" + "flowerPacks=" + flowerPacks + '}';
    }
}
