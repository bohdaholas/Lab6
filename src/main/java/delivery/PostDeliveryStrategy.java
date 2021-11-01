package delivery;

import item.Item;

import java.util.LinkedList;

public class PostDeliveryStrategy implements Delivery {
    @Override
    public String deliver(LinkedList<Item> items) {
        return "Delivering via post";
    }
}
