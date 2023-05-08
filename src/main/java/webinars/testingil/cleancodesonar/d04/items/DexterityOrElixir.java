package webinars.testingil.cleancodesonar.d04.items;

import webinars.testingil.cleancodesonar.d04.Item;
import webinars.testingil.cleancodesonar.d04.StoredItem;

public class DexterityOrElixir extends StoredItem {
    public DexterityOrElixir(Item item) {
        super(item);
    }

    public void update() {
        if (item.quality > 0) {
            decrease_quality();
        }
        this.decrease_sell_in();
        if (item.quality > 0 && item.sellIn < 0) {
                decrease_quality();
        }
    }
}
