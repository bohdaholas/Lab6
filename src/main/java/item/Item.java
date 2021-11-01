package item;

public abstract class Item {
    private String description;

    public String getDescription() {
        return description;
    }

    public abstract double price();
}
