package flowerstore;

import java.util.ArrayList;
import java.util.List;

public class Store {
    List<FlowerBucket> flowerBuckets = new ArrayList<>();

    public void addFlowerBucket(FlowerBucket flowerBucket) {
        flowerBuckets.add(flowerBucket);
    }

    public List<FlowerBucket> search(int budget) {
        List<FlowerBucket> affordableFlowerBuckets = new ArrayList<>();
        for (FlowerBucket flowerbucket : flowerBuckets) {
           if (flowerbucket.price() < budget) {
               affordableFlowerBuckets.add(flowerbucket);
           }
        }
        return affordableFlowerBuckets;
    }
}
