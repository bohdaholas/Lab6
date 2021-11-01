package delivery;

import flowerstore.RomashkaFlower;
import order.Order;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeliveryTest {
    @Test
    void deliver() {
        Order order = new Order();
        RomashkaFlower romashkaFlower = new RomashkaFlower();
        order.addItem(romashkaFlower);
        PostDeliveryStrategy post = new PostDeliveryStrategy();
        assertEquals("Delivering via post", post.deliver(order.getItems()));
        DHLDeliveryStrategy dhl = new DHLDeliveryStrategy();
        assertEquals("Delivering via DHL", dhl.deliver(order.getItems()));
    }
}