package item;

public class BasketDecorator extends ItemDecorator {
    private final Item item;

    public BasketDecorator(Item item) {
        this.item = item;
    }

    public double getPrice() {
        return 4 + item.price();
    }

    @Override
    public String getDescription() {
        return "Basket decorator";
    }

    @Override
    public double price() {
        return getPrice();
    }
}
