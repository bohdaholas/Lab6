package item;

public class RibbonDecorator extends ItemDecorator {
    private final Item item;

    public RibbonDecorator(Item item) {
        this.item = item;
    }

    public double getPrice() {
        return 40 + item.price();
    }

    @Override
    public String getDescription() {
        return "Ribbon decorator";
    }

    @Override
    public double price() {
        return getPrice();
    }
}
