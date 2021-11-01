package order;

import delivery.Delivery;
import item.Item;
import payment.Payment;

import java.util.LinkedList;

public class Order {

    private final LinkedList<Item> items = new LinkedList<>();
    private Payment payment;
    private Delivery delivery;

    public LinkedList<Item> getItems() {
        return items;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public void setDelivery(Delivery delivery) {
        this.delivery = delivery;
    }

    public double calculateTotalPrice() {
        double price = 0;
        for (Item item : items) {
            price += item.price();
        }
        return price;
    }

    public String processOrder(LinkedList<Item> items) {
        String paymentMSG = payment.pay(calculateTotalPrice());
        String deliveryMSG = delivery.deliver(items);
        return paymentMSG + "\n" + deliveryMSG;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
       items.pop();
    }

    public Payment getPayment() {
        return payment;
    }

    public Delivery getDelivery() {
        return delivery;
    }
}
