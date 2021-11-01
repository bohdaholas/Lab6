package item;

import flowerstore.RomashkaFlower;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ItemTest {
    @Test
    void price() {
        RomashkaFlower romashkaFlower = new RomashkaFlower();
        RibbonDecorator decoratedRomashka = new RibbonDecorator(romashkaFlower);
        assertEquals(80, decoratedRomashka.getPrice());
        PaperDecorator twiceDecoratedRomashka = new PaperDecorator(decoratedRomashka);
        assertEquals(93, twiceDecoratedRomashka.getPrice());
    }
}