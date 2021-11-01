package item;

public class PaperDecorator extends ItemDecorator {
    private final Item item;

    public PaperDecorator(Item item) {
        this.item = item;
    }

    public double getPrice() {
        return 13 + item.price();
    }

    @Override
    public String getDescription() {
        return "Paper decorator";
    }

    @Override
    public double price() {
        return getPrice();
    }
}
