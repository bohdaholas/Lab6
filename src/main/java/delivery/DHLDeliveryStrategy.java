package delivery;

import item.Item;

import java.util.LinkedList;

public class DHLDeliveryStrategy implements Delivery {
    @Override
    public String deliver(LinkedList<Item> items) {
        return "Delivering via DHL";
    }
}
