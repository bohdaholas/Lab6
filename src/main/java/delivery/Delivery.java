package delivery;

import item.Item;

import java.util.LinkedList;

public interface Delivery {
    String deliver(LinkedList<Item> items);
}
